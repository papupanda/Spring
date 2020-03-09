package com.nt.confugration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value="classpath:com/nt/common/db.properties")
public class PersitanceConfugration {
	@Autowired
	private Environment env;
	
	public PersitanceConfugration() {
		System.out.println("DaoConfugration.DaoConfugration()");
	}
	@Bean(name="ds")
	public DataSource createconnection() {
		HikariDataSource datasource=null;
		System.out.println("DaoConfugration.createconnection()");
		datasource=new HikariDataSource();
		datasource.setDriverClassName(env.getProperty("jdbc.driver"));
		datasource.setJdbcUrl(env.getProperty("jdbc.url"));
		datasource.setUsername(env.getProperty("jdbc.user"));
		datasource.setPassword(env.getProperty("jdbc.password"));
		return datasource;
	}

}
