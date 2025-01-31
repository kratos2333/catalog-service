package com.kevin.catalogservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@Configuration
@EnableJdbcAuditing
// use @EnableJpaAuditing for JPA
public class DataConfig {}
