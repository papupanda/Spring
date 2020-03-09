package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.ResturantCommand;
import com.nt.dto.ResturantDto;
import com.nt.service.ResturantService;

public class ResturantController extends SimpleFormController {
	private ResturantService service;
	public ResturantController(ResturantService service) {
		this.service = service;
	}
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		ResturantDto dto=null;
		String resultmsg=null;
		//convert command class obj to dto
		dto=new ResturantDto();
		BeanUtils.copyProperties((ResturantCommand)command, dto);
		//use service
		resultmsg=service.register(dto);
		
		return new ModelAndView("Show","msg",resultmsg);
	}
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return new ModelAndView("dbl_post");
	}
	

}
