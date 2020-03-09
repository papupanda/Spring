package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.Wishgenerator;

public class ClientApp {

	public static void main(String[] args) {
		//locate Spring bean configuration file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//activate BeanFactory container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get bean class object
		Wishgenerator bean=(Wishgenerator)factory.getBean("wsg");
		//call business method
		String result=bean.generatorWishmsg("dipu");
		System.out.println(result);

	}//main

}//class
