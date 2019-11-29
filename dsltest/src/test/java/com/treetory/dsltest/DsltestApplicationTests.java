package com.treetory.dsltest;

import com.treetory.dsltest.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DsltestApplicationTests {

    @Autowired
    private TestService tService;

    //@Test
    public void insertUsingTransactionTemplate() {
        tService.doInsertByJsonArrayFile("d:\\temp\\mplustest");
    }

    @Test
    public void insertUsingJdbcTemplate() {
        tService.doInsertByJsonObject("d:\\temp\\drug", TestService.TEST_TYPE.jdbcTemplate);
    }

    //@Test
    public void insertUsingJooq() {
        tService.doInsertByJsonObject("d:\\temp\\mplustest", TestService.TEST_TYPE.jooq);
    }

}
