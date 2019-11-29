package com.treetory.dsltest.repository;

import com.google.gson.internal.LinkedTreeMap;
import com.treetory.dsltest.model.tables.Checkaccessrights;
import com.treetory.dsltest.model.tables.records.CheckaccessrightsRecord;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.stream.Collectors;

@Repository
public class JooqDAO {

    private static final Logger LOG = LoggerFactory.getLogger(JooqDAO.class);

    @Autowired
    private DSLContext dslContext;

    private StringBuilder sb = new StringBuilder();

    /**
     *  개별 데이터를 DSLContext 를 이용하여 쿼리문 생성 후 입력
     *
     * @param data
     * @param file
     */
    public synchronized void insertJobByUsingJooq(LinkedTreeMap<String, /*? extends*/ Object> data, File file) {
        try {

            data.entrySet()
                    .stream()
                    //.filter(String.class::isInstance)
                    .map(_data -> {
                        // 이름 가운데 글자 치환
                        if (_data.getKey().contains("Nm") &&
                                (_data.getKey().contains("doctor") || _data.getKey().contains("patient"))
                        ) {
                            sb.append(_data.getValue());
                            sb.replace(1, sb.length()-1, "*");
                            _data.setValue((sb.toString()));
                            sb.delete(0, sb.length());
                        }
                        return _data;
                    }).collect(Collectors.toList());

            String tableName = StringUtils.capitalize((((file.getName()).split("\\."))[0]).toLowerCase());

            /**
             * jOOQ 를 이용할 때는 아래와 같이 file name 으로부터 table, record class 를 찾아내어
             * 해당 클래스 인스턴스를 생성한 후, 클래스 인스턴스에 값을 바인딩한 후에
             * dslContext 를 이용하여 쿼리문을 생성할 때, 각 컬럼명과 값을 매핑하였다.
             * -> 이렇게 코드를 짜자니 모든 테이블에 대해서 바인딩하는 코드를 작성해야 한다... 일단 현재 동적으로 바인딩할 다른 방법이 생각나지 않는다... dsl 은 처음이라...
             * -> 그래서 preparedStatement 를 사용하는 것으로 돌아가기로 했다...
             */
            Class<?> t_clazz = Class.forName(String.format("com.treetory.dsltest.model.tables.%s", tableName));
            Class<?> f_clazz = Class.forName(String.format("com.treetory.dsltest.model.tables.records.%sRecord", tableName));
            switch(t_clazz.getTypeName()) {
                case "com.treetory.dsltest.model.tables.Checkaccessrights" :

                    Checkaccessrights o = (Checkaccessrights) t_clazz.newInstance();
                    CheckaccessrightsRecord r = (CheckaccessrightsRecord) f_clazz.newInstance();

                    r.setHospitalcd((String)data.get("hospitalCd"));
                    r.setIsallowed((String)data.get("isAllowed"));
                    r.setRejectedmsg((String)data.get("rejectedMsg"));

                    dslContext
                            .insertInto(o, o.HOSPITALCD, o.ISALLOWED, o.REJECTEDMSG)
                            //.values((String)data.get("hospitalCd"), (String)data.get("isAllowed"), (String)data.get("rejectedMsg"))
                            .values(r.value1(), r.value2(), r.value3())
                            .execute();

                    break;
                default:
                    break;
            }

        } catch (NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            LOG.error("### [{}] ### {} {}", file.getName(), System.lineSeparator(), e);
        }
    }

}
