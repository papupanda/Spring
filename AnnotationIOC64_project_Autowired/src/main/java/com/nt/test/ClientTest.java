package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Viechle;

public class ClientTest {

	public static void main(String[] args) {
		//create ioc container
		Viechle v=null;
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       v=ctx.getBean("viechle",Viechle.class);
       System.out.println(v);
	}

}
