package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBo;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDto;

public class StudentServiceimpl implements StudentService {
	private StudentDao dao;

	public StudentServiceimpl(StudentDao dao) {
		this.dao = dao;
	}

	public List<StudentDto> UpdateAll() {
		List<StudentBo> listbo=null;
		List<StudentDto> listdto=new ArrayList<StudentDto>();
		listbo=new ArrayList<StudentBo>();
		
		//use fetchall
		listbo=dao.FetchAll();
		System.out.println();
		//convert bo to dto
		listbo.forEach(bo->{
			
			StudentDto dto=new StudentDto();
			//BeanUtils.copyProperties(bo, dto);
			dto.setSid(bo.getSid());
			dto.setSname(bo.getSname());
			dto.setAge(bo.getAge());
			dto.setFathername(bo.getFathername());
			dto.setAdharno(bo.getAdharno());
			dto.setAddress(bo.getAddress());
			dto.setPhonenumber(bo.getPhonenumber());
			dto.setBatch(bo.getBatch());
			//add listdto
			listdto.add(dto);
			
		}
		
		);
		
		return listdto;
	}

	@Override
	public StudentDto getByid(int sid) {
		 StudentDto dto=null;
		 StudentBo bo=null;
		 //dto object is created
		 bo=new StudentBo();
		 dto=new StudentDto();
		 //use dao
		 bo=dao.getStudentid(sid);
		 //convert bo to dto
		 BeanUtils.copyProperties(bo, dto);
				return dto;
	}

	@Override
	public String ModifyStudentByNo(StudentDto dto) {
		StudentBo bo=null;
		int count=0;
		//convert bo to dto
		bo=new StudentBo();
		BeanUtils.copyProperties(bo, dto);
		//use dao
		count=dao.updateStudentByid(bo);
		if(count==0) {
			return dto.getSid()+"updation Failed";
		}
		else {
			return dto.getSid()+"updation successed";
		}
		
	}

	@Override
	public String Register(StudentDto dto) {
		int count=0;
		StudentBo bo=null;
		bo=new StudentBo();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		if(count==0) {
			return "Student Record Failed";
		}
		else {
			return "Student Record Success";
		}
		
	}

	@Override
	public String RemoveStudentById(int sid) {
		int count=0;
		count=dao.DeleteStudentByid(sid);
		if(count==0) {
			return "Delete Failed";
		}
		else {
			return "Delete successed";
		}
	}

}
