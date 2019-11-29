package com.treetory.dsltest.repository;

import com.google.gson.internal.LinkedTreeMap;
import com.treetory.dsltest.util.UndiscriminationStringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JdbcTemplateDAO {

    private static final Logger LOG = LoggerFactory.getLogger(JdbcTemplateDAO.class);

    private TransactionTemplate transactionTemplate;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void init() {
        transactionTemplate = new TransactionTemplate();
        transactionTemplate.setTransactionManager(transactionManager);
    }

    /**
     *  개별 데이터 입력
     *
     * @param data
     * @param file
     */
    public void insertJobByUsingJdbcTemplate(LinkedTreeMap<String, /*? extends*/ Object> data, File file) {
        jdbcTemplate.update(this.createQueryString(data, file));
    }

    /**
     *  전체 데이터 통째로 입력
     *
     * @param datas
     */
    public void insertJobByUsingTransactionTemplate(List<LinkedTreeMap<String, /*? extends*/ Object>> datas, File file) {

        List<String> queries = new ArrayList<>();

        datas.stream().forEach(data -> {
            queries.add(this.createQueryString(data, file));
        });

        LOG.debug("QUERY COUNT = {}", queries.size());

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {

                int rowCnt = 0;

                try {
                    for (String query : queries) {
                        rowCnt += jdbcTemplate.update(query);
                    }

                } catch (Exception e) {
                    transactionStatus.setRollbackOnly();
                    LOG.error("{}", e);
                } finally {
                    LOG.debug("INSERTED COUNT = {}", rowCnt);
                }

            }
        });

    }

    /**
     *  INSERT 쿼리문 만들기 -> 1. 사람 이름의 가운데 문자 '*' 치환 2. INSERT QUERY 생성
     *
     * @param data
     * @param file
     */
    public synchronized String createQueryString(LinkedTreeMap<String, /*? extends*/ Object> data, File file) {

        String query = "";

        try {

            StringBuffer _cols = new StringBuffer();
            _cols.append("(");

            StringBuffer _vals = new StringBuffer();
            _vals.append("(");

            data.entrySet()
                    .stream()
                    //.filter(String.class::isInstance)
                    .map(_data -> {
                        // 이름 가운데 글자 치환
                        if (_data.getKey().contains("Nm") &&
                                (_data.getKey().contains("doctor") || _data.getKey().contains("patient"))
                        ) {
                            /*
                            StringBuilder sb = new StringBuilder();
                            sb.append(_data.getValue());
                            sb.replace(1, sb.length()-1, "*");
                            _data.setValue((sb.toString()));
                            sb.delete(0, sb.length());
                            */
                            _data.setValue(UndiscriminationStringUtil.doUndiscrimination((String)_data.getValue()));
                        }

                        _cols.append(_data.getKey());
                        _cols.append(",");
                        _vals.append('"');
                        _vals.append(_data.getValue());
                        _vals.append('"');
                        _vals.append(",");

                        return _data;
                    }).collect(Collectors.toList());

            _cols.delete(_cols.lastIndexOf(","), _cols.length());
            _cols.append(")");
            _vals.delete(_vals.lastIndexOf(","), _vals.length());
            _vals.append(")");

            String tableName = StringUtils.capitalize((((file.getName()).split("\\."))[0]).toLowerCase());

            query = String.format("INSERT INTO %s %s VALUES %s;", tableName, _cols.toString(), _vals.toString());

            //LOG.debug("{}", query);

        } catch (NullPointerException /*| ClassNotFoundException | InstantiationException | IllegalAccessException*/ e) {
            LOG.error("### [{}] ### {} {}", file.getName(), System.lineSeparator(), e);
        }

        return query;
    }

}
