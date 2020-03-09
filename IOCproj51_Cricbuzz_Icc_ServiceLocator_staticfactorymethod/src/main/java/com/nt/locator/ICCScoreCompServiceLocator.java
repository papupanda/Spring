package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator{

	public static ICCScoreComp getExtComp() {
		System.out.println("ICCScoreCompServiceLocator.getExtComp()");
		ICCScoreComp  extcomp=null;
		//actually we should write jndi lookup code to get externel comp ref from jndi registry
		//right now we creating that obj dirctly here
		extcomp=new ICCScoreCompImpl();
		return extcomp;
	}

}