package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//call get bean
		Bank bank=ctx.getBean("bank",Bank.class);
		System.out.println("intr Amt"+bank.calclntrAmt(10000, 20));
	}

}
