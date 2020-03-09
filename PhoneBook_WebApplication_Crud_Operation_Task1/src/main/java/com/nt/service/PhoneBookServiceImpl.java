package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PhoneBookBo;
import com.nt.dao.PhoneBookDao;
import com.nt.dto.PhoneBookDto;

@Service("eservice")
public class PhoneBookServiceImpl implements PhoneBookService {
	@Autowired
	private PhoneBookDao dao;

	@Override
	public String insertService(PhoneBookDto dto) {
		PhoneBookBo bo=null;
		int count=0;
		//convert dto to bo
		bo=new PhoneBookBo();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		return (count==0)?"Insert Failed":"Insert Success";
	}

	@Override
	public List<PhoneBookDto> fetchAllservice() {
		List<PhoneBookBo> listbo=null;
		List<PhoneBookDto> listdto=new ArrayList<PhoneBookDto>();
		//use dao
		listbo=dao.fetchAll();
		//convert bo to dto
		listbo.forEach(bo->{
			PhoneBookDto dto=new PhoneBookDto();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		
		return listdto;
	}

	@Override
	public String DeleteService(int sno) {
		int count=0;
		//use dao
		count=dao.delete(sno);
		return (count==0)?"Delete Failed":"Delete Success";
	}

	@Override
	public PhoneBookDto getbyidservice(int sno) {
		PhoneBookDto dto=null;
		PhoneBookBo bo=null;
		bo=new PhoneBookBo();
		//use dao
		bo=dao.getbyid(sno);
		//convert bo to dto
		dto=new PhoneBookDto();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public String editbyidservice(PhoneBookDto dto) {
		PhoneBookBo bo=null;
		int count=0;
		//convert dto to bo
		bo=new PhoneBookBo();
		BeanUtils.copyProperties(dto, bo);
		//use service
		count=dao.editbyid(bo);
		return (count==0)?"edit failed":"edit success";
	}

}
