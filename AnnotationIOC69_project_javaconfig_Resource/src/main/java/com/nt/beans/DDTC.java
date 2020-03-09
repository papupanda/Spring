package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DDTC implements Courier {
	@Value("ameerpet")
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
