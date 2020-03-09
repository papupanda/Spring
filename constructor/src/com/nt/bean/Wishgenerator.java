package com.nt.bean;

import java.util.Date;

import com.nt.dependentclass.DependentClas;

public class Wishgenerator {
	//bean properties
	private Date date;
	private String msg;
	private String name;
	private DependentClas depnd;
	public void setDepnd(DependentClas depnd) {
		this.depnd = depnd;
		System.out.println("Wishgenerator.setDepnd()");
	}
	int hour=0;
	public void setDate(Date date) {
		this.date=date;
		System.out.println("seter injection");
	}
	public Wishgenerator(Date date) {
		this.date=date;
		System.out.println(" 1 parameter");
	}
	//geter method for constructor injection 
	public Wishgenerator(String name,String msg) {
		this.name=name;
		this.msg=msg;
		System.out.println(" 2 parameter");
	}
	//business logic 
	public String generatorWishmsg(String name) {
		hour=date.getHours();
		if(hour<12) {
			return "good morning ::"+name;
		}
		else if(17<hour) {
			return "good after noon :: "+name;
			
		}
		else  if(20<hour){
			return "good evening ::"+name;
		}
		else {
			return "good night ::"+name;
		}
	}

}
