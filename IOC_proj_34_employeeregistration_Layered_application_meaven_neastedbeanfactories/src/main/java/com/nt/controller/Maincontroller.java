package com.nt.controller;

import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVo;

public class Maincontroller {
	EmployeeService service;
	String result=null;

	public Maincontroller(EmployeeService service) {
		this.service = service;
	}
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
	

