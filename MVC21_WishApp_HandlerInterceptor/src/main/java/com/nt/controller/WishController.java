package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//get system date and time
		Calendar cal=Calendar.getInstance();
		//get current hour of the day
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12) {
			msg="Good morning";
		}
		else if(hour<16) {
			msg="Good afternoon";
		}
		else if(hour<20) {
			msg="Good evening";
		}
		else {
			msg="Good night";
		}
		return new ModelAndView("result","wmsg",msg);
	}

}
