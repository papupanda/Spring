package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMessageService;

public class WishGenerator extends AbstractController {
	
private WishMessageService service;

	public WishGenerator(WishMessageService service) {
	this.service = service;
}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String msg=null;
		//use service
		msg=service.generateWishMessage();
		//keep mav object
		return new ModelAndView("result","wsmg",msg);
	}
	

}
