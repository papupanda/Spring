package com.nt.beans;

public class BlueDart implements Courier{
	private String branch;
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "BlueDart [branch=" + branch + "]";
	}
	

}
