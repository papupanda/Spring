package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LCTestApp {

	public static void main(String[] args) {
		FileSystemResource res=null;
		BeanFactory factory=null;
		//locate the filesystem
		 res=new FileSystemResource("src/com/nt/cfgg/applicationContext.xml");
		//create ioc container
		 factory=new XmlBeanFactory(res);
		 //get bean id object
		 Flipkart bean=factory.getBean("fpk",Flipkart.class);
		 String Billmessage=bean.purchase(new String[] {"shirt","mobile","book"});
		 System.out.println(Billmessage);
		
	}

}
