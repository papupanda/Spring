package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;
@Service("eservice")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public String authenticate(EmployeeDto dto) {
		EmployeeBo bo=null;
		int count=0;
		//convert dto to bo
		bo=new EmployeeBo();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.validate(bo);
		return (count==0)?"Invalid Credential":"Valid Credential";
	}

}
