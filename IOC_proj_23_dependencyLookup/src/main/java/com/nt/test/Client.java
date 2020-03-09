package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Engine;
import com.nt.beans.Viechle;

public class Client {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		//create reader
		reader=new XmlBeanDefinitionReader(factory);
		//locate file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call bean method
		Viechle viechle=factory.getBean("viechle",Viechle.class);
		viechle.move();

	}

}
