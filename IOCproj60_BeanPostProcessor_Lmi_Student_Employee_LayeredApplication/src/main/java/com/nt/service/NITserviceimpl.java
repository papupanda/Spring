package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;
import com.nt.dao.NITDao;
import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;

public abstract class NITserviceimpl implements NITservice {
	private NITDao dao;

	public NITserviceimpl(NITDao dao) {
		this.dao = dao;
	}
	public abstract StudentBo createStudentBo();
	public abstract EmployeeBo createEmployeeBo();

	public String registerStudent(StudentDto dto) {
		//get studentbo class object by using lmi
		StudentBo bo=null;
		int count =0;
		bo=createStudentBo();
		BeanUtils.copyProperties(dto,bo);
		//use dao
		count=dao.insertStudent(bo);
		if(count==0) {
			return "registration failed";
		}
		else {
			return "registration successed";
		}
	}

	public String registerEmployee(EmployeeDto dto) {
		//get studentbo class object by using lmi
				EmployeeBo bo=null;
				int count =0;
				bo=createEmployeeBo();
				BeanUtils.copyProperties(dto,bo);
				//use dao
				count=dao.insertEmployee(bo);
				if(count==0) {
					return "registration failed";
				}
				else {
					return "registration successed";
				}
	}

}
