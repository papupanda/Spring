package com.nt.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;
@Named("wish")
public class WishGenerator {
	@Resource
	private Calendar calendar;
	public WishGenerator() {
		System.out.println("WishGenerato.0 param constructor");
	}
	
	public String generateWishMsg(String user) {
		System.out.println("WishGenerator.generateWishMsg()");
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate wish message
		if(hour<=12) {
			return "Good morning::"+user;
		}
		else if(hour<=16) {
			return "Good Afternoon::"+user;
			
		}
		else if(hour<=20) {
			return "Good Evening::"+user;
		}
		else {
			return "Good night::"+user;
		}
	}//method
 
}//class
