package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishGenerator extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Calendar cal=null;
		String msg=null;
		//get system date and time
		cal=Calendar.getInstance();
		//get current hour day
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12) {
			msg="good morning";
		}
		else if(hour<16) {
			msg="good afternoon";
		}
		else if(hour<20) {
			msg="good evining";
		}
		else {
			msg="good night";
		}
		return new ModelAndView("result","wsmg",msg);
	}

}
