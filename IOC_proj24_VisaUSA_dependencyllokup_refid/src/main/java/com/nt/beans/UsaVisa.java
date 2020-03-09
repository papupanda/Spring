package com.nt.beans;

import java.util.Calendar;

public class UsaVisa {
	public UsaVisa() {
		System.out.println("0 parametirc constructor");
	}
	public boolean IsAproved() {
		Calendar cal=null;
		int month=0;
		cal=Calendar.getInstance();
		month=cal.get(Calendar.MONTH);
		if(4<month&&month<8) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
