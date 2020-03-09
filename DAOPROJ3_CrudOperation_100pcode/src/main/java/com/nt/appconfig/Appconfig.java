package com.nt.appconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {BusinessConfig.class,PersitanceConfig.class})
public class Appconfig{
	public Appconfig() {
		System.out.println("Appconfig.Appconfig()");
	}
	
	

}
