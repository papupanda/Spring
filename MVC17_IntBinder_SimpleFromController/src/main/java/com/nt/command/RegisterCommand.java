package com.nt.command;

import java.util.Date;

public class RegisterCommand {
	private String name;
	private Date dob;
	private Date dom;
	private Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", dob=" + dob + ", dom=" + dom + ", doj=" + doj + "]";
	}
	

}
