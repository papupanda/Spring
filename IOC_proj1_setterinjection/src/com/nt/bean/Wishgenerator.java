package com.nt.bean;

import java.util.Date;

public class Wishgenerator {
	//bean properties
	private Date date;
	int hour=0;
	//geter method for setter injection 
	public void setDate(Date date) {
		this.date=date;
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
