package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("re")
@Scope("prototype")
public class RequestHandler {
	
	private static int count,reqcount;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-param constructor--"+count);
	}
	public void processRequest(String data) {
		reqcount++;
		System.out.println("processing request no"+reqcount+"with data"+data);
	}

}
