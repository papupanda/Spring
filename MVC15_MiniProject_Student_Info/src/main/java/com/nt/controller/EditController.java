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

public class EditController extends SimpleFormController {
	private StudentService service;
	public EditController(StudentService service) {
		this.service = service;
	}
	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		int sid=0;
		StudentDto dto=null;
		StudentCommand cmd=null;
		//create command class object
		
		dto=new StudentDto();
		//read id req param
		sid=Integer.parseInt(req.getParameter("sid"));
		//use service
		dto=service.getByid(sid);
		//convert dto to command
		cmd=new StudentCommand();
		BeanUtils.copyProperties(dto, cmd);
		return cmd;
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentDto dto=null;
		String result=null;
		ModelAndView mav=null;
		List<StudentDto> listdto=null;
		//convert dto to command
		dto=new StudentDto();
		BeanUtils.copyProperties((StudentCommand)command, dto);
		//use service
		result=service.ModifyStudentByNo(dto);
		listdto=service.UpdateAll();
		//create mav object
		mav=new ModelAndView();
		mav.setViewName("result_student");
		mav.addObject("listdto",listdto);
		//mav.addObject("msg",result);
		return mav;
	}

}
