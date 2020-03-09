package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("service")
public class WishMessageImpl implements WishMessage {

	public String GenerateMessage() {
		Calendar cal=null;
		int hour=0;
		//get System date
		cal=Calendar.getInstance();
		//get current hour of the day
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good after noon";
		else if(hour<20)
			return "Good evening";
		else
			return "Good night";
		
	}

}
