package com.nt.service;

import java.util.List;

import com.nt.dto.Employeedto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.Employeedto;

@Service("eservice")
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	

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

