package com.mds.commonservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.mds.commonservices.repositories")
@ConfigurationPropertiesScan({ "com.mds.commonservices.resource"})
@SpringBootApplication
public class CommonservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonservicesApplication.class, args);
    }

}
