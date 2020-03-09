package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.A;
import com.nt.beans.B;

public class ClientApp {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A a=null;
		B a1=null;
		//ioc container created
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//loacte xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call getbean
		a=factory.getBean("a1",A.class);
		System.out.println(a);
		a1=factory.getBean("b1",B.class);
		System.out.println(a1);
		

	}

}
