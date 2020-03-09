package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.TourismBo;
import com.nt.dao.TourismDao;
import com.nt.dto.TourismDto;

public class Tourismserviceimpl implements Tourismservice {
	private TourismDao dao;
	public Tourismserviceimpl(TourismDao dao) {
		System.out.println("Tourismserviceimpl.1 param construtor");
		this.dao=dao;
	}

	public List<TourismDto> getAllPlace(String[] states) throws Exception {
		System.out.println("Tourismserviceimpl.getAllPlace()");
		List<TourismBo> listbo=null;
		List<TourismDto> listdto=null;
		StringBuffer sb=null;
		sb=new StringBuffer("(");
		for(int i=0;i<states.length;i++)
		{
			if(i==states.length-1) {
				sb.append("'"+states[i]+"'");
			}
			else
			{
				sb.append("'"+states[i]+"',");
			}
		}
		sb.append(")");
		String sb1=sb.toString();
		//System.out.println(sb);
		//use dao
		listbo=dao.view(sb1);
		listdto=new ArrayList<TourismDto>();
		for(TourismBo bo:listbo)
		{
			TourismDto dto=new TourismDto();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listdto.size()+1);
			listdto.add(dto);
			//System.out.println(listdto);
		}
		return listdto;
	}

}
