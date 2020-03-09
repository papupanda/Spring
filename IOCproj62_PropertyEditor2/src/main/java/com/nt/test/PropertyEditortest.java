package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.pe.CustomIntrAmtEditor;

public class PropertyEditortest {

	public static void main(String[] args) {
		
		IntrAmtCalculator id=null;
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//register 
		factory.addPropertyEditorRegistrar(new MyCustomPer());
		id=factory.getBean("intrcalculator",IntrAmtCalculator.class);
		System.out.println(id.calclntrAmt());

	}

}
class MyCustomPer implements PropertyEditorRegistrar{

	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(IntrAmtDetails.class,new CustomIntrAmtEditor());
		
	}
	
}
