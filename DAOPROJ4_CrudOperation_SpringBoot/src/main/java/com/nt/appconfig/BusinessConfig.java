package com.nt.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.service")
public class BusinessConfig {
	public BusinessConfig() {
		System.out.println("BusinessConfig.BusinessConfig()");
	}

}
