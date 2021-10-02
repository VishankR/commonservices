/*
package com.mds.commonservices.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.PoolingDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.*;
import java.util.Properties;


@Configuration
@EnableTransactionManagement
public class HibernateConf {
    private static File file1;
    private static HikariConfig config = new HikariConfig(*/
/*"src/main/resources/hikari.properties"*//*
);
    static {
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mds");
        config.setUsername("mdsdev");
        config.setPassword("mdsdev");
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
    }

    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() throws IOException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        //The second property packagesToScan specifies Java package to automatically scan for annotated entity classes.
        // This way it is no longer necessary to prepare Hibernate mapping file.
        sessionFactory.setPackagesToScan(
                "com.mds.commonservices.entities");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        return new HikariDataSource( config );
    }

    @Bean
    public PlatformTransactionManager hibernateTransactionManager() throws IOException {
        HibernateTransactionManager transactionManager
                = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

    private Properties hibernateProperties() throws IOException {
        Properties hibernateProperties = new Properties();
        //FileReader reader=new FileReader("com.mds.commonservices.resources.hibernate.properties");
        //InputStream input = new FileInputStream("./com/mds/commonservices/resources/hibernate.properties");
        File file = new ClassPathResource("hibernate.properties").getFile();
        FileReader reader = new FileReader(file);
        hibernateProperties.load(reader);
        return hibernateProperties;
    }
}
*/
