package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckEligibility;

public class ClientApp {

	public static void main(String[] args) {
		
		//create Ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//getbean
		CheckEligibility check=ctx.getBean("ce",CheckEligibility.class);
		System.out.println(check.checkvotingeligibility());
		//close container
		((AbstractApplicationContext) ctx).close();
        
	}

}
