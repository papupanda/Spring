package com.nt.beans;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class BeanConfugration {
	public BeanConfugration(){
		System.out.println("BeanConfugration.0 param constructor");
	}
	@Bean(name="cal")
	public Calendar createCalender() {
		System.out.println("BeanConfugration.createCalender()");
		return  Calendar.getInstance();
	}//method

}//class
