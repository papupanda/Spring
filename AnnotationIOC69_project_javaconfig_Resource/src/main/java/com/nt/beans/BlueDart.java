package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bluedart")
public class BlueDart implements Courier{
	@Value("hyd")
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
