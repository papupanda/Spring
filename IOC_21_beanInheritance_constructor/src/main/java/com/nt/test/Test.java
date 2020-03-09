package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bike b=null,b1=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//loacte xml file path
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// call get bean
		b=factory.getBean("pulsor",Bike.class);
		System.out.println(b);
		System.out.println(".......................");
		b1=factory.getBean("pulsor1",Bike.class);
		System.out.println(b1);

	}

}
