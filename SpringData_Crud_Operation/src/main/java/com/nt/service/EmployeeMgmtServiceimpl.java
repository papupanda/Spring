package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDto;
import com.nt.entity.EmployeeEntity;
import com.nt.reprository.EmployeeReprository;
@Service("empservice")
public class EmployeeMgmtServiceimpl implements EmployeeMgmtService {

	@Autowired
	private EmployeeReprository rep;
	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<EmployeeEntity> listentites=null;
		List<EmployeeDto> listdto=new ArrayList<EmployeeDto>();
		listentites=(List<EmployeeEntity>) rep.findAll();
		//cconvert listennties to listdto
	  listentites.forEach(emp->{
		  //copy each entity to dto
		  EmployeeDto dto=new EmployeeDto();
		  BeanUtils.copyProperties(emp,dto);
		  listdto.add(dto);
	  });
		
		return listdto;
	}

}
