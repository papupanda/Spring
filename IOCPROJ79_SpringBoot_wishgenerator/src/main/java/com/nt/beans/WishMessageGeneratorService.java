package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ms")
public class WishMessageGeneratorService {
	@Autowired
	private Calendar calendar;
	public String generateWishMessage(String name) {
		
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate wish message
		if(hour<=12) {
			return "Good morning " + name;
		}
		else if(hour<=16) {
			return "good afternoon " + name;
		}
		else if(hour<=20) {
			return "good evening " + name;
		}
		else {
			return "good night " + name;
		}
	}//method

}//class
