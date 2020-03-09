package com.nt.appconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersitanceConfig {
	public PersitanceConfig() {
		System.out.println("PersitanceConfig.PersitanceConfig()");
	}
	@Bean(name="ds")
	public DataSource createconnection() {
		HikariDataSource datasource=null;
		System.out.println("PersitanceConfig.createconnection()");
		datasource=new HikariDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		datasource.setUsername("system");
		datasource.setPassword("satya");
		return datasource;
	   
	}
	@Bean
	public  JdbcTemplate  createJT() {
		return new JdbcTemplate(createconnection());
	}

}
