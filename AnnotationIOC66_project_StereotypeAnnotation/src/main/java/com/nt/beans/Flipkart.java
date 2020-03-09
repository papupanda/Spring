package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Flipkart {
	@Qualifier("bluedart")
	@Autowired
	private Courier courier;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	

}
