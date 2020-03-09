package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	private static final String emp_login="SELECT COUNT(*)FROM  EMPLOGIN WHERE USERNAME=? AND PASSWORD=?";
	@Autowired
	private JdbcTemplate jt;

	public int validate(EmployeeBo bo) {
		//initialise
		int count=0;
		count=jt.queryForObject(emp_login,Integer.class,bo.getUsername(),bo.getPassword());
		
		//return 
		return count;
	}

}
