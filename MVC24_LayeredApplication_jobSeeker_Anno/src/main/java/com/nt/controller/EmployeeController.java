package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.Employeedto;
import com.nt.service.EmployeeService;

public class EmployeeController extends AbstractController {
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Employeedto> listdto=null;
		//use service
		listdto=service.FetchAllOpening();
		return new ModelAndView("show_jobs","listjobs",listdto);
	}

}
