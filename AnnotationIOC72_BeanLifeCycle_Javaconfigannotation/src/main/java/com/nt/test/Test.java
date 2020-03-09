package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voter;

public class Test {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		Voter vt=ctx.getBean("vt",Voter.class);
		String status=vt.CheckVotingElgibility();
		System.out.println("result::"+status);
		((AbstractApplicationContext) ctx).close();
	}

}
