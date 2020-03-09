package com.nt.confugration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.nt.service")
public class ServiceConfugration {
	public ServiceConfugration() {
		System.out.println("ServiceConfugration.ServiceConfugration()");
	}
	

}
