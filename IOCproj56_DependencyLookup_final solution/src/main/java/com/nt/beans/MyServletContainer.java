package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx;
	
	public MyServletContainer(String beanId) {
		this.beanId = beanId;
	}
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("MyServletContainer.1 param constructor");
		this.ctx=ctx;
	}
		


	private RequestHandler handler;
	
//	public MyServletContainer(RequestHandler handler) {
//		System.out.println("MyServletContainer.MyServletContainer()");
//		this.handler = handler;
//	}


	public void handleRequest(String data) {
		System.out.println("MyServletContainer.handleRequest() with Date"+data);
		handler=ctx.getBean("re",RequestHandler.class);
		handler=new RequestHandler();
		//create ioc container
		handler.processRequest(data);
		
	}



}
