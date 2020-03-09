package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AdharDetails;

public class PropertyEditorTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AdharDetails ad=null;
		//create IOC cotainer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ad=ctx.getBean("adhar",AdharDetails.class);
		System.out.println(ad);
	}

}
