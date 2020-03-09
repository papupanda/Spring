package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class PersitanceAppConfig {
	@Bean
	public JndiObjectFactoryBean createJOFB() {
		JndiObjectFactoryBean job=new JndiObjectFactoryBean();
		job.setJndiName("java:/comp/env/Dsjndi");
		return job;
	}
	@Bean
	@Primary
	public DataSource createDs() {
		return (DataSource) createJOFB().getObject();
	}

}
