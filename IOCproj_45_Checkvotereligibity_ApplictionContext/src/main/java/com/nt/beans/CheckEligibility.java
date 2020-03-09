package com.nt.beans;

import java.util.Date;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class CheckEligibility {
	public CheckEligibility() {
		System.out.println("CheckEligibility.CheckEligibility()");
	}
	private String name,addres;
	private int age;
	Date sysdate;
	
	public void setName(String name) {
		System.out.println("CheckEligibility.setName()");
		this.name = name;
	}
	
	public void setAddres(String addres) {
		System.out.println("CheckEligibility.setAddres()");
		this.addres = addres;
	}
	
	public void setAge(int age) {
		System.out.println("CheckEligibility.setAge()");
		this.age = age;
	}
	//create custom int method
	public void myint() {
		System.out.println("CheckEligibility.myint()");
		if(name==null || age<=0) {
			throw new IllegalArgumentException("name age must set with values");
		}
	}
	public String checkvotingeligibility() {
		if(age>=18) {
			return name +" u r eligible for vote";
		}
		else {
			return name +" u r not eligible for vote";
		}
	}
	//create custom destroy method
	public void mydestroy() {
		System.out.println("CheckEligibility.mydestroy()");
		name=null;
		age=0;
		addres=null;
	}
	

}
