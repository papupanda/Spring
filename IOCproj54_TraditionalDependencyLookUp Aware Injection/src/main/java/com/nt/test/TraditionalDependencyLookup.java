package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class TraditionalDependencyLookup {
	

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Vehicle v=ctx.getBean("vr",Vehicle.class);
		v.entertainment();
		v.music();
		v.journey();
		((AbstractApplicationContext) ctx).close();
	}

}
