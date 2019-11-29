package com.treetory.dsltest.config;

import com.google.gson.Gson;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.ConnectionProvider;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jooq.JooqExceptionTranslator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@EnableAsync
@Configuration
public class ApplicationConfiguration implements InitializingBean {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationConfiguration.class);

    @Autowired
    private ApplicationContext appContext;

    /**
     * Configure jOOQ's ConnectionProvider to use Spring's TransactionAwareDataSourceProxy,
     * which can dynamically discover the transaction context
     *
     * 스프링 부트가 DataSourceTransactionManager 를 직접 물고 있기 때문에,
     * jOOQ 는 proxy 를 이용하여 transaction 관리를 하는 것 같다.
     *
     * @return  DataSourceConnectionProvider
     */
    @Bean(name = "connectionProvider")
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy((DataSource) appContext.getBean("dataSource")));
    }

    private DefaultConfiguration configuration() {

        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(SQLDialect.MARIADB);
        jooqConfiguration.set((ConnectionProvider) appContext.getBean("connectionProvider"));
        jooqConfiguration.set(new DefaultExecuteListenerProvider(new JooqExceptionTranslator()));

        return jooqConfiguration;
    }

    /**
     * Configure the DSL object, optionally overriding jOOQ Exceptions with Spring Exceptions
     *
     * jOOQ 는 DSL (Domain Specific Language) 을 통해 SQL 을 다룬다. 그래서 DSLContext 를 기본적으로 필요로 한다.
     * DSLContext 를 생성할 때에 jOOQ 의 configuration 을 전달해야 하는데,
     * 아래는 connectionProvider 와 ExecuteListenerProvider 를 설정한 configuration 을 DSLContext 에 전달한다.
     *
     * @return
     */
    @Bean(name = "dsl")
    //@Lazy(value = true)
    public DSLContext dsl() {

        DSLContext dsl = new DefaultDSLContext(configuration());

        return dsl;

    }
    @Bean(name = "gson")
    public Gson gson() {
        return new Gson();
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate((DataSource) appContext.getBean("dataSource"));
        jdbcTemplate.setQueryTimeout(60*60*1);
        return jdbcTemplate;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager((DataSource) appContext.getBean("dataSource"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        HikariDataSource dataSource = (HikariDataSource) appContext.getBean("dataSource");
        LOG.debug("USER = {} / SCHEMA = {}", dataSource.getUsername(), dataSource.getSchema());
        LOG.debug("jOOQ Configuration = {}", appContext.getBean("dsl"));
    }

}
