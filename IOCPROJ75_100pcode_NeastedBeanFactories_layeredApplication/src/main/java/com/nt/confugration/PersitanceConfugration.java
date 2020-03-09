package com.nt.confugration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersitanceConfugration {
	
	public PersitanceConfugration() {
		System.out.println("DaoConfugration.DaoConfugration()");
	}
	@Bean(name="ds")
	public DataSource createconnection() {
		HikariDataSource datasource=null;
		System.out.println("DaoConfugration.createconnection()");
		datasource=new HikariDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		datasource.setUsername("system");
		datasource.setPassword("satya");
		return datasource;
	}

}
