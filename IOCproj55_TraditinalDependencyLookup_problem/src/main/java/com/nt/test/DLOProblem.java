package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class DLOProblem {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=null;
		MyServletContainer container=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		container=ctx.getBean("myservlet",MyServletContainer.class);
		//invoke method
		container.handleRequest("hello");
		System.out.println(".............................");
		container.handleRequest("hi");
		((AbstractApplicationContext) ctx).close();
		

	}

}
