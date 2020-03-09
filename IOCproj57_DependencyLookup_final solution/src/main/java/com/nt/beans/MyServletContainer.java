package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class MyServletContainer {
	public MyServletContainer() {
		System.out.println("MyServletContainer.0 param constructor");
	}
	public abstract RequestHandler createRequestHandler();
	
	public void handleRequest(String data) {
		RequestHandler handler=null;
		//get dependent bean using dependency lookup
		handler=createRequestHandler();
		//invoke method
		handler.processRequest(data);
	}
	

}
