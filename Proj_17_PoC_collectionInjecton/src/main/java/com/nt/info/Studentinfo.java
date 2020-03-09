package com.nt.info;

import java.util.Date;
import java.util.Set;

public class Studentinfo {
	public Studentinfo() {
		System.out.println("Studentinfo.Studentinfo()");
	}
	private Set<Long> phonenumber;
	private Set<Date> date;
	public void setPhonenumber(Set<Long> phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setDate(Set<Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Studentinfo [phonenumber=" + phonenumber + ", date=" + date + "]";
	}
	
	

}
