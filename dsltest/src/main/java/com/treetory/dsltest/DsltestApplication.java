package com.treetory.dsltest;

import com.treetory.dsltest.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsltestApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DsltestApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DsltestApplication.class, args);

    }

}
