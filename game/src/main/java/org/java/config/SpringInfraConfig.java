package org.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by mgupta on 8/13/16.
 */
@Configuration
public class SpringInfraConfig {
    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
