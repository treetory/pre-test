package com.treetory.dsltest.service;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.treetory.dsltest.repository.JdbcTemplateDAO;
import com.treetory.dsltest.repository.JooqDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  json 파일 읽어들여서 query 생성 후 insert 하는 예제
 * @author treetory@gmail.com
 */
@Service
public class TestService {

    private static final Logger LOG = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private Gson gson;

    @Autowired
    private JdbcTemplateDAO jdbcTemplateDAO;

    @Autowired
    private JooqDAO jooqDAO;

    public enum TEST_TYPE {
        jooq, jdbcTemplate
    }

    public void doInsertByJsonArrayFile(String path) {

        try {

            File f = new File(path);
            if (f.isDirectory()) {
                List<File> files = Arrays.asList(f.listFiles());
                files.stream().forEach(file -> {
                    try {
                        List<LinkedTreeMap<String, /*? extends*/ Object>> datas = this.getData(file);
                        LOG.debug("FILE NAME = {}, DATA COUNT = {}", file.getName(), datas.size());
                        jdbcTemplateDAO.insertJobByUsingTransactionTemplate(datas, file);
                    } catch (FileNotFoundException | JsonSyntaxException e) {
                        LOG.error("### [{}] ### {} {}", file.getName(), System.lineSeparator(), e);
                    }
                });
            }

        } catch (Exception e) {
            LOG.error("{}", e);
        }

    }

    /**
     *
     * @param path
     */
    public void doInsertByJsonObject(String path, TEST_TYPE type) {

        LOG.debug("SERVICE : WELCOME TO {}!!!", this.getClass().getCanonicalName());
        LOG.debug("FILEPATH : {}", path);

        try {

            File f = new File(path);
            if (f.isDirectory()) {
                List<File> files = Arrays.asList(f.listFiles());
                files.stream().forEach(file -> {
                    try {
                        List<LinkedTreeMap<String, /*? extends*/ Object>> datas = this.getData(file);
                        if (datas.size() > 0) {
                            datas.stream().forEach(data -> {
                                this.doJobByTestType(data, file, type);
                            });
                        }
                    } catch (FileNotFoundException | JsonSyntaxException e) {
                        LOG.error("### [{}] ### {} {}", file.getName(), System.lineSeparator(), e);
                    }

                    //jdbcTemplateDAO.insertJobByUsingTransactionTemplate(queries);
                });

            }

        } catch (Exception e) {
            LOG.error("{}", e);
        }

    }

    private void doJobByTestType(LinkedTreeMap<String, Object> data, File file, TEST_TYPE type) {

        switch (type) {

            case jooq:
                jooqDAO.insertJobByUsingJooq(data, file);
                break;
            case jdbcTemplate:
                jdbcTemplateDAO.insertJobByUsingJdbcTemplate(data, file);
                break;
        }

    }

    /**
     *
     * @param file
     * @return
     * @throws FileNotFoundException
     * @throws JsonSyntaxException
     */
    private List<LinkedTreeMap<String, /*? extends*/ Object>> getData(File file) throws FileNotFoundException, JsonSyntaxException {
        List<LinkedTreeMap<String, /*? extends*/ Object>> result = gson.fromJson(new JsonReader(new BufferedReader(new FileReader(file))), ArrayList.class);
        return (result == null ? Collections.emptyList() : result);
    }

}
