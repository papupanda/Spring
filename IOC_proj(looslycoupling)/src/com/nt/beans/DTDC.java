package com.nt.beans;

public class DTDC implements Courier{
	public DTDC() {
	   System.out.println("DTDC.DTDC()");
	}
	public final String deliver(int orderid) {
		return "BlueDart is ready to deliver produts of"+orderid;
	}

}

