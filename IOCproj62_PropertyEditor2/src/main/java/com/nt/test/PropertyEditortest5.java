package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.pe.CustomIntrAmtEditor;

public class PropertyEditortest5 {

	public static void main(String[] args) {
		
		IntrAmtCalculator id=null;
		BeanFactoryPostProcessor bfpp=null;
		
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//Get BeanFactoryPostProcessor class object
		bfpp=factory.getBean("cc",BeanFactoryPostProcessor.class);
		bfpp.postProcessBeanFactory(factory);
		
		//Get IntrAmtCalculator class object
		id=factory.getBean("intrcalculator",IntrAmtCalculator.class);
		System.out.println(id.calclntrAmt());
	}

}

