package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.ResturantBo;

public class ResturantDaoImpl implements ResturantDao {
	private static final String resturant="INSERT INTO RESTURANT_INFO VALUES(ITEMNO_SEQ.NEXTVAL,?,?,?,?)";
	private JdbcTemplate jt;

	public ResturantDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(ResturantBo bo) {
		int count=0;
		count=jt.update(resturant,bo.getItemname(),bo.getCatagory(),bo.getPrice(),bo.getAvailabe());
		
		return count;
	}

}
