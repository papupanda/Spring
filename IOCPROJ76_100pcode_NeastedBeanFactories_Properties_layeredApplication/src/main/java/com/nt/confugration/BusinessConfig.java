package com.nt.confugration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {PersitanceConfugration.class,ServiceConfugration.class})
public class BusinessConfig {
	public BusinessConfig() {
		System.out.println("BusinessConfig.BusinessConfig()");
	}

}
