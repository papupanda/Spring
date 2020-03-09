package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVo;

@Controller("controller")
public class Maincontroller {
	@Autowired
	EmployeeService service;
	String result=null;

	public String processEmployee(EmployeeVo vo) throws Exception {
		//converting vo object to dto object
		EmployeeDto dto=new EmployeeDto();
			//1dto=new EmployeeDto();
		dto.setEmpno(Integer.parseInt(vo.getEmpno()));
		dto.setEmpname(vo.getEmpname());
		dto.setEmpaddrs(vo.getEmpaddrs());
		dto.setBasicsalary(Double.parseDouble(vo.getBasicsalary()));
		//use service
		 result=service.register(dto);
		
		 return result;	
	}
	//process employee
		

}//class
	

