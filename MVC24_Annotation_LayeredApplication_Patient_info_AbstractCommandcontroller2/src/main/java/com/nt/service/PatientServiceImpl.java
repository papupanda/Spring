package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PatientInputBo;
import com.nt.bo.PatientResultBo;
import com.nt.dao.PatientSearchDao;
import com.nt.dto.PatientInputDto;
import com.nt.dto.PatientResultDto;

@Service("eservice")
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientSearchDao dao;

	

	@Override
	public List<PatientResultDto> Search(PatientInputDto dto) {
		PatientInputBo ibo=null;
		List<PatientResultBo> listbo=null;
		List<PatientResultDto> listdto=new ArrayList<PatientResultDto>();
		
		//convert dto to bo
		ibo=new PatientInputBo();
	    BeanUtils.copyProperties(dto, ibo);
	    if(ibo.getPatientname().length()!=0) 	    	
	    	ibo.setPatientname(ibo.getPatientname()+"%");
	   ibo.setAddrs(ibo.getAddrs().length()!=0?ibo.getAddrs()+"%":ibo.getAddrs());
	   ibo.setProblem(ibo.getProblem().length()!=0?ibo.getProblem()+"%":ibo.getProblem());
	    //use dao
	    
	    listbo=dao.find(ibo);
	    //copy listbo to listdto
	    listbo.forEach(rbo->{
	    	PatientResultDto pdto=new PatientResultDto();
	    	BeanUtils.copyProperties(rbo, pdto);
	    	listdto.add(pdto);
	    });
		return listdto;
	}

}
