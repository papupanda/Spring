package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Persondetail;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Persondetail p=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//locate the xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		p=factory.getBean("per",Persondetail.class);
		System.out.println(p);
	}

}
