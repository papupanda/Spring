package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersitanceConfig {
	@Bean
	public JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean jofb=null;
		jofb=new JndiObjectFactoryBean();
		jofb.setJndiName("java:/comp/env/Dsjndi");
		return jofb;
	}
	
	
	
	
	@Bean
	public  JdbcTemplate  createJdbcTemplate() {
		JdbcTemplate jt=null;
		jt=new JdbcTemplate();
		jt.setDataSource((DataSource) createJOFB().getObject());
		return jt;
	}

}
