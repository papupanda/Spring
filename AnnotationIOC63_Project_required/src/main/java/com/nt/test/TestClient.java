package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class TestClient {

	public static void main(String[] args) {
		//create Ioc container
		ApplicationContext ctx=null;
		Robot robo=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		robo=ctx.getBean("robot",Robot.class);
		System.out.println(robo);
		
		

	}

}
