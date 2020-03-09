package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.IntrAmtCalculator;

public class ClientApp {

	public static void main(String[] args) {
		//create Ioc Container
		IntrAmtCalculator amt=null;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get bean
		amt=ctx.getBean("pfb",IntrAmtCalculator.class);
		float intrAmt=amt.calclntrAmt(80000,2,20);
		System.out.println("intrAmt="+intrAmt);
		

	}

}
