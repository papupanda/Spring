package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

public class ScheduleReminder {
	private Calendar cal;
	public void setDate(Calendar cal) {
		this.cal=cal;
	}
	public String remainder1(){
		Calendar syscal=null;
		cal=Calendar.getInstance();
		syscal.getInstance();
		if(cal.get(Calendar.MONTH)==syscal.get(Calendar.MONTH)&&cal.get(Calendar.DATE)==syscal.get(Calendar.DATE)) {
			return "reminder....tring tring spesialone birthday wish ";
		}
		else {
			return "no remainder";
		}
	}

}
