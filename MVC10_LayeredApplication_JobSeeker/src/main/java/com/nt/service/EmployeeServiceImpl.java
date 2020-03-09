package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.Employeedto;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;

	public EmployeeServiceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Employeedto> FetchAllOpening() {
		List<EmployeeBo> listbo=null;
		List<Employeedto> listdto=new ArrayList<Employeedto>();;
		
		//use dao
		listbo=dao.getAllJobOpening();
		//convert listbo to listdto
		listbo.forEach(bo->{
			Employeedto dto=new Employeedto();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}

}
