package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Viechle {
	private String beanId;
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public Viechle() {
		System.out.println("viecle 0 param constructor");
	}
	public void move() {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		//create reader
		reader=new XmlBeanDefinitionReader(factory);
		//locate file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call bean method
		Engine engine=factory.getBean(beanId,Engine.class);
		engine.start();
		System.out.println("vehicle moved for journy");
	}

}
