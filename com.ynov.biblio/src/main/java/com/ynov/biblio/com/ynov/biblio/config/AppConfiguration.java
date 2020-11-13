package com.ynov.biblio.com.ynov.biblio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfiguration {

	public DriverManagerDataSource providerSource() {
		DriverManagerDataSource ds=  new DriverManagerDataSource();
		ds.setUsername("root");
        ds.setPassword("");
        ds.setUrl("jdbc:mysql://localhost:3306/feedback?useSSL=false&serverTimezone=UTC");
        return ds;
	}
	
	@Bean(name = "applicationJdbcTemplate")
	public JdbcTemplate applicationDataConnection() {
		return new JdbcTemplate(providerSource());
	}
}
