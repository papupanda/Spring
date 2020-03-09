package com.nt.beans;

import java.net.URL;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class AdharDetails {
	private int id;
	private long mobileno;
	private String name;
	private Date dob;
	private URL linkedurl;
	private String[] verifies;
	private byte age;
	private String gender;
	private boolean single;
	private Currency curency;
	private Class favouritejavaclass;
	private Locale locale;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
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
	public URL getLinkedurl() {
		return linkedurl;
	}
	public void setLinkedurl(URL linkedurl) {
		this.linkedurl = linkedurl;
	}
	public String[] getVerifies() {
		return verifies;
	}
	public void setVerifies(String[] verifies) {
		this.verifies = verifies;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isSingle() {
		return single;
	}
	public void setSingle(boolean single) {
		this.single = single;
	}
	public Currency getCurency() {
		return curency;
	}
	public void setCurency(Currency curency) {
		this.curency = curency;
	}
	public Class getFavouritejavaclass() {
		return favouritejavaclass;
	}
	public void setFavouritejavaclass(Class favouritejavaclass) {
		this.favouritejavaclass = favouritejavaclass;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "AdharDetails [id=" + id + ", mobileno=" + mobileno + ", name=" + name + ", dob=" + dob + ", linkedurl="
				+ linkedurl + ", verifies=" + Arrays.toString(verifies) + ", age=" + age + ", gender=" + gender
				+ ", single=" + single + ", curency=" + curency + ", favouritejavaclass=" + favouritejavaclass
				+ ", locale=" + locale + "]";
	}
	
	
	

}
