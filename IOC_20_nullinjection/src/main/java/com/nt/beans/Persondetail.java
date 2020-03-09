package com.nt.beans;

import java.util.Date;

public class Persondetail {
	private int pno;
	private String name;
	private String wife;
	private Date dob;
	private Date doj;
	private Date dom;
	public Persondetail(int pno, String name, String wife, Date dob, Date doj, Date dom) {
		
		this.pno = pno;
		this.name = name;
		this.wife = wife;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "Persondetail [pno=" + pno + ", name=" + name + ", wife=" + wife + ", dob=" + dob + ", doj=" + doj
				+ ", dom=" + dom + "]";
	}
	

}
