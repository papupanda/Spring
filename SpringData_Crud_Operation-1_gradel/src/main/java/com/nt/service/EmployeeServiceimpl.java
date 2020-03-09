package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDto;
import com.nt.entity.Employee;
import com.nt.reprository.MyReprository;

@Service("empService")
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private MyReprository rep;

	@Override
	public String registerEmployee(EmployeeDto dto) {
		Employee empEntity=null,empEntity2=null;
		//convert dto to bo/entity
		empEntity=new Employee();
		BeanUtils.copyProperties(dto, empEntity);
		//use reprository
		empEntity2=rep.save(empEntity);
		if(empEntity2==null) {
			return "Employee not registered";
		}
		else {
			return "Employee is registered";
		}
		
	}

}
