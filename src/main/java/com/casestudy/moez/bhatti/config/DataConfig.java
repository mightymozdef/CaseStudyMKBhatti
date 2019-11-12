package com.casestudy.moez.bhatti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

import static org.hibernate.cfg.AvailableSettings.*;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.casestudy.moez.bhatti.repository")
@PropertySource("classpath:db.properties")
public class DataConfig {

    @Autowired
    private Environment environment;

    //Spring JPA config details
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
        lcemfb.setJpaVendorAdapter(getJpaVendorAdapter());
        lcemfb.setDataSource(dataSource());
        lcemfb.setPersistenceUnitName("CaseStudyPersistenceUnit");
        lcemfb.setPackagesToScan("com.casestudy.moez.bhatti.models");
        lcemfb.setJpaProperties(hibernateProperties());
        return lcemfb;
    }

    @Bean
    public JpaVendorAdapter getJpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager txManager() {
        return new JpaTransactionManager(getEntityManagerFactoryBean().getObject());
    }

    //JDBC Properties
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }


    //Hibernate Properties
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put(DIALECT, environment.getRequiredProperty(DIALECT));
        properties.put(SHOW_SQL, environment.getRequiredProperty(SHOW_SQL));
        properties.put(FORMAT_SQL, environment.getRequiredProperty(FORMAT_SQL));
        properties.put(HBM2DDL_AUTO, environment.getRequiredProperty(HBM2DDL_AUTO));
        properties.put(ENABLE_LAZY_LOAD_NO_TRANS, environment.getRequiredProperty(ENABLE_LAZY_LOAD_NO_TRANS));
        return properties;
    }


}
