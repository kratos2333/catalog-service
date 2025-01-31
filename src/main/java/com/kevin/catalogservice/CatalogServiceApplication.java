package com.kevin.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


// TODO: note: use buildPack to build the app into image:
// ./mvnw spring-boot:build-image -DskipTests
// the built image will be named : catalog-service:0.0.1-SNAPSHOT by default (<project_name>:)
// $ docker run --rm --platform linux/amd64 --name catalog-service -p 8080:8080 catalog-service:0.0.1-SNAPSHOT
@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

}
