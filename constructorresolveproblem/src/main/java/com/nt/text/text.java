package com.nt.text;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.mark.Mark;
import com.nt.student.Student;

public class text {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
	    XmlBeanDefinitionReader reader=null;
	    Student st=null;
	    Mark m=null;
		//create ioc contatainer
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		//load defination
		reader.loadBeanDefinitions("com/nt/cfgs/applictionContext.xml");
		//call method
		st=factory.getBean("st",Student.class);
		System.out.println(st);
		System.out.println("......................");
		m=factory.getBean("m",Mark.class);
		System.out.println(m);
		

	}

}
