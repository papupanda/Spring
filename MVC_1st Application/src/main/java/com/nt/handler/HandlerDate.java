package com.nt.handler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerDate implements Handler {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) {
		Date sysdate=null;
		sysdate=new Date();
		req.setAttribute("result", sysdate);
		return "date";
	}

}
