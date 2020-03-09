package com.nt.controller;

import com.nt.dto.StudentDto;
import com.nt.service.StudentService;
import com.nt.vo.StudentVo;

public final class MainController {
	private StudentService service;

	public MainController(StudentService service) {
		this.service = service;
	}
	public String ProcessStudent(StudentVo vo)throws Exception{
		//prepare Vo class object
		
		//String sno = null;
		//String mark1 = null,mark2=null,mark3=null;
		//String sname = null;
		//vo.setSno(sno);
		//vo.setSname(sname);
		//vo.setMark1(mark1);
		//vo.setMark2(mark2);
		//vo.setMark3(mark3);
		//converting vo object to dto object
		StudentDto dto=new StudentDto();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		//use service
		String result=service.register(dto);
		
		return result;
	
	}

}
