package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeServiceimpl implements EmployeeService {
	private EmployeeDao dao;

	public EmployeeServiceimpl(EmployeeDao dao) {
		this.dao = dao;
	}

	public String Register(EmployeeDto dto) {
		EmployeeBo bo=null;
		bo=new EmployeeBo();
		int count =0;
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		if(count==0) {
			return "Empolyee registration Failed";
		}
		else {
			return "Employee Registration Sucessed";
		
	}//else
	}//method

}//class
