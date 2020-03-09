package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	private String beanId;

	public Vehicle(String beanId) {
		this.beanId = beanId;
		System.out.println("Vehicle.1 param constructor");
	}
	public void entertainment() {
		System.out.println("Vehicle.entertainment()");
	}
	public void music() {
		System.out.println("Vehicle.music()");
	}
	public void journey() {
		//create advance IOC container 
		ApplicationContext ctx=null;
		Engine eng=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		eng=ctx.getBean(beanId,Engine.class);
		eng.start();
		
		eng.stop();
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}