package com.stasio.chatmusya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.stasio.chatmusya.service" , "com.stasio.chatmusya.dao" })
public class SpringConfig {



    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:~/chatmusya;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa42sa");
        dataSource.setPassword("sa42sa");
        return dataSource;
    }

}
