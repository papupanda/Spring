package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.WishMessage;

@Controller
public class WishController {
	private WishMessage message;
	
	public WishController(WishMessage message) {
		this.message = message;
	}

	@RequestMapping("/wish.htm")
	public ModelAndView process() {
		String msg=null;
		//use service class
		msg=message.GenerateMessage();
		return new ModelAndView("result" ,"wmsg",msg);
	}

}
