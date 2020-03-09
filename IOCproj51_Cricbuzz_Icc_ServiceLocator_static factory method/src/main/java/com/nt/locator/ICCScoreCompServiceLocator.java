package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator implements  FactoryBean<ICCScoreComp> {

	@Override
	public ICCScoreComp getObject() throws Exception {
		System.out.println("ICCScoreCompServiceLocator.getObject()");
		ICCScoreComp  extcomp=null;
		//actually we should write jndi lookup code to get externel comp ref from jndi registry
		//right now we creating that obj dirctly here
		extcomp=new ICCScoreCompImpl();
		return extcomp;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("ICCScoreCompServiceLocator.getObjectType()");
		return ICCScoreComp.class;
	}
	@Override
	public boolean isSingleton() {
	System.out.println("ICCScoreCompServiceLocator.isSingleton()");
		return true;
	}

}
