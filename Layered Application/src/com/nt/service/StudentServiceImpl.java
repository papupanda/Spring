package com.nt.service;

import com.n.dao.StudentDao;
import com.nt.bo.StudentBo;
import com.nt.dto.StudentDto;

public final class StudentServiceImpl implements StudentService{
	private StudentDao dao;
	StudentDto dto=null;

	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public String register(StudentDto dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBo bo=null;
		int count=0;
		
		//write business logic
		int m1=dto.getMark1();
		int m2=dto.getMark2();
		int m3=dto.getMark3();
		total=m1+m2+m3;
		avg=total/3.0f;
		if(m1<35 || m2<35 || m3<35) {
			result="Fail";
		}
		else {
			result="Pass";
		}
		//create Student Bo class object
		bo=new StudentBo();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use dao
         count=dao.insert(bo);
         if(count==0) {
        	 return "Registation faild And Your Result is::  "+result;
         }
         else {
        	 return "Registion sucessed And Your Result is:: "+result;
         }
	}
}

	