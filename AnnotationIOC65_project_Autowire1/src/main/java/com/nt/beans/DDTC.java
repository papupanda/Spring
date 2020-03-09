package com.nt.beans;

public class DDTC implements Courier {
	private String branch;
	
	public DDTC() {
		System.out.println("DDTC.0 param constructor");
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "DDTC [branch=" + branch + "]";
	}
	

}
