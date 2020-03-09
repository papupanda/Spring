package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.EmployeeBo;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String Emp_info="INSERT INTO EMPLOYEE_INFO VALUES(ID_SEQ.NEXTVAL,?,?,?)";
	private JdbcTemplate jt;

	public EmployeeDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(EmployeeBo bo) {
		int count=0;
		count=jt.update(Emp_info,bo.getFirstName(),bo.getLastName(),bo.getEmail());
		return count;
	}

}
