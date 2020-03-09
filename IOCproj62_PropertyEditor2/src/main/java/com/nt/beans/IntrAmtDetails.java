package com.nt.beans;

public class IntrAmtDetails {
	private int principle;
	private int time;
	private int rate;
	public int getPrinciple() {
		return principle;
	}
	public void setPrinciple(int principle) {
		this.principle = principle;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "IntrAmtDetails [principle=" + principle + ", time=" + time + ", rate=" + rate + "]";
	}
	
	

}
