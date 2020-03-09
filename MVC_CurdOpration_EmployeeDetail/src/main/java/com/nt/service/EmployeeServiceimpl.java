package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBo;
import com.nt.dao.Employeedao;
import com.nt.dto.EmployeeDto;
@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private Employeedao dao;
	@Override
	public String fetchall(EmployeeDto dto) {
		//declare variable
		EmployeeBo bo=null;
		int count=0;
		//create bo class object
		bo=new EmployeeBo();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		
		return (count==0)?"Insert Failed":"Insert Sucess";
	}
	@Override
	public List<EmployeeDto> retrieve() {
		List<EmployeeBo> listbo=null;
		List<EmployeeDto> listdto=new ArrayList<EmployeeDto>();
		listbo=new ArrayList<EmployeeBo>();
		//use dao
		listbo=dao.getAll();
		//convert bo to dto
		listbo.forEach(bo->{
			EmployeeDto dto=new EmployeeDto();
			BeanUtils.copyProperties(bo, dto);
			//add listdto
			listdto.add(dto);
		});
		return listdto;
	}
	//get by id
	@Override
	public EmployeeDto getempbyid(int id) {
		EmployeeDto dto=null;
		EmployeeBo bo=null;
		//use dao
		bo=new EmployeeBo();
		bo=dao.getEmployeeByid(id);
		//convert bo to dto
		
		dto=new EmployeeDto();
		BeanUtils.copyProperties(bo, dto);
		//System.out.println(dto.getName());
		//System.out.println(dto.getSalary());
		return dto;
	}
	//edit
	@Override
	public String update(EmployeeDto dto) {
		int count=0;
		EmployeeBo bo=null;
		//convert dto to bo
		bo=new EmployeeBo();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.UpdateEmployeeDetail(bo);
		
		return (count==0)?"Edit Failed":"Edit Sucess";
	}
	@Override
	public String deletestudentbyid(int id) {
		int count=0;
		//use dao
		count=dao.deleteById(id);
		return (count==0)?"Delete Failed":"Delete Success";
	}
	

}
