package com.nt.handler;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerSystem implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Properties prop=null;
		prop=System.getProperties();
		//set attribute
		req.setAttribute("result", prop);
		//return ivn logical view name
		return "props";
	}

}
