package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDto;
import com.nt.service.StudentService;

public class StudentController extends AbstractController {
	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}



	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		List<StudentDto> listdto=new ArrayList<StudentDto>();
		//use service
		listdto=service.UpdateAll();
		return new ModelAndView("result_student","listdto",listdto);
	}

}
