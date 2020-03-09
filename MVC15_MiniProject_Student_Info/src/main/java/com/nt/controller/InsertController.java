package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDto;
import com.nt.service.StudentService;

public class InsertController extends SimpleFormController {
	private StudentService service;
	public InsertController(StudentService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		StudentDto dto=null;
		String resultmsg=null;
		StudentCommand cmd=null;
		ModelAndView mav=null;
		List<StudentDto> listdto=null;
		//convert cmd to dto
		cmd=(StudentCommand)command;
		dto=new StudentDto();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		resultmsg=service.Register(dto);
		listdto=service.UpdateAll();
		//return mav
		mav=new ModelAndView();
		mav.addObject("msg",resultmsg);
		mav.addObject("reportdata",listdto);
		mav.setViewName("result_student");
		return mav;
		
	}

}
