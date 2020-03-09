package com.nt.beans;

public class MyServletContainer {
	private String beanId;
	
	public MyServletContainer(String beanId) {
		this.beanId = beanId;
	}


	private RequestHandler handler;
	
//	public MyServletContainer(RequestHandler handler) {
//		System.out.println("MyServletContainer.MyServletContainer()");
//		this.handler = handler;
//	}


	public void handleRequest(String data) {
		System.out.println("MyServletContainer.handleRequest() with Date"+data);
		handler=new RequestHandler();
		//create ioc container
		handler.processRequest(data);
		
	}
	

}
