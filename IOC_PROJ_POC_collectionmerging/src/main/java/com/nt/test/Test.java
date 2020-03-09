package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.bean.EnginerrCollege;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EnginerrCollege e=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		//read
		reader=new XmlBeanDefinitionReader(factory);
		//load xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean
		e=factory.getBean("col",EnginerrCollege.class);
		System.out.println(e);
		
	}

}
