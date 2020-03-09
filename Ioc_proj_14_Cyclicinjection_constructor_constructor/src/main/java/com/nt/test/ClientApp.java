package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A a=null;
		//ioc container created
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//loacte xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call getbean
		a=factory.getBean("a",A.class);
		System.out.println(a);
		

	}

}
