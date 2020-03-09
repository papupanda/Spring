package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.bean.Wishgenerator;

public class ClientApp {
	public ClientApp() {
		System.out.println("0 param constructor client");
	}

	public static void main(String[] args) {
		//locate spring bean config file
		ClassPathResource res=new ClassPathResource("applicationContext.xml");
		//create ioc container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get bean class object
		Wishgenerator bean=factory.getBean("wsg",Wishgenerator.class);
		//call business method
		String result=bean.generatorWishmsg("papu");
		System.out.println(result);
	}

}
