package com.nt.beans;

import java.util.Date;

public class ScheduleReminder {
	private Date date;
	public void setDate(Date date) {
		this.date=date;
	}
	public String remainder1(){
		Date sysdate=new Date();
		if(date.getMonth()==sysdate.getMonth()&&date.getDate()==sysdate.getDate()) {
			return "reminder....tring tring spesialone birthday wish ";
		}
		else {
			return "no remainder";
		}
	}

}
