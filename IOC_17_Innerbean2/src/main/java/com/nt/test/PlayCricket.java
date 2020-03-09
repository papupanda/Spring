package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.Cricket.Bat;
import com.nt.Cricket.Professional;

public class PlayCricket {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Professional b=null;
		//create ioc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//locate xml file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//call bean 
	    b=factory.getBean("com.nt.Cricket.Professional",Professional.class);
		System.out.println(b);
	}

}
