package com.nt.dao;

import java.util.List;

import com.nt.bo.TourismBo;

public interface TourismDao {
	
		public List<TourismBo> view(String cond)throws Exception;
	}



