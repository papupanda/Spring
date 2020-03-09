package com.nt.confugration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
public class PresentationConfig {
	public PresentationConfig() {
		System.out.println("PresentationConfig.PresentationConfig()");
	}

}
