package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Person {
	private String beanId;
	public Person(String beanId) {
		this.beanId = beanId;
		System.out.println("param constructor");
	}
	/*public Person() {
		System.out.println(" 0 param construtor");
	}*/
	public void dancing() {
		System.out.println("person dancing");
	}
	public void eating() {
		System.out.println("person eating");
	}
	public void journey() {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		//create reader
		reader=new XmlBeanDefinitionReader(factory);
		//locate file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call bean method
	    UsaVisa usa=factory.getBean(beanId,UsaVisa.class);
	    if(usa.IsAproved())
	    {
	    	System.out.println("Going to USA");
	    }
	    else
	    {
	    	System.out.println("i will go next time.");
	    }
	}

}
