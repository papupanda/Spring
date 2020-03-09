package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.BankLoanApprover;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory pfactory,cfactory=null;
		XmlBeanDefinitionReader preader,creader=null;
        //create ioc container
		pfactory=new DefaultListableBeanFactory();
		preader=new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("com/nt/cfgs/loan-beans.xml");
		//create ioc container
		cfactory=new DefaultListableBeanFactory(pfactory);
		creader=new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/nt/cfgs/approval-beans.xml");
		
		BankLoanApprover approver=cfactory.getBean("bla",BankLoanApprover.class);
		System.out.println(approver.approveLoan());
		System.out.println(approver);
	}

}
