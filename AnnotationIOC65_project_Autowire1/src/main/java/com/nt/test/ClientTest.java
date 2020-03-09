package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class ClientTest {

	public static void main(String[] args) {
		//create Ioc container
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Flipkart f=ctx.getBean("flip",Flipkart.class);
		System.out.println(f);

	}

}
