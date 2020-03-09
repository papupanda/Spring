package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.dto.Employeedto;
import com.nt.service.EmployeeService;

@Controller("contro")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	
   @RequestMapping("/show.htm")
	public String handle(Map<String,Object> map)
			throws Exception {
		List<Employeedto> listdto=null;
		//use service
		listdto=service.FetchAllOpening();
		map.put("listjobs",listdto);
		 return "show_jobs";
	}

}
