package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle implements ApplicationContextAware{
	private String beanId;
    private ApplicationContext ctx;
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
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Vehicle.setApplicationContext()");
		this.ctx=ctx;
		
	}
	public void journey() {
		Engine eng=null;
		eng=ctx.getBean(beanId,Engine.class);
		eng.start();
		
		eng.stop();
		//close container
		((AbstractApplicationContext) ctx).close();
	}
	
}