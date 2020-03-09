package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.ResturantBo;
import com.nt.dao.ResturantDao;
import com.nt.dto.ResturantDto;

public class ResturantServiceimpl implements ResturantService {
	private ResturantDao dao;
	public ResturantServiceimpl(ResturantDao dao) {
		this.dao = dao;
	}
	public String register(ResturantDto dto) {
		int count=0;
		ResturantBo bo=null;
		//convert dto to bo
		bo=new ResturantBo();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		if(count==0) {
			return "Add Cart Failed";
		}
		else {
			return "Add Cart Sucessed";
		}
		
		
	}
	

}
