package com.nt.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	private static final String Get_emp_count="SELECT COUNT(*)FROM EMP";
	private static final String get_emp_salary="SELECT SALARY FROM EMP  WHERE EMPNO=?";
	private static final String get_emp_no="SELECT EMPNO,ENAME,JOB,SALARY FROM EMP WHERE EMPNO=?";
	@Autowired
	private JdbcTemplate jt;

	public EmployeeDaoImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int getEmployeecount() {
		int count=0;
		count=jt.queryForObject(Get_emp_count,Integer.class);
		
		return count;
	}

	public float getEmployeeSalaryByno(int empno) {
		float salary=0;
		salary=jt.queryForObject(get_emp_salary,Float.class,empno);
		return salary;
	}

	public Map<String, Object> getEmployeeByno(int empno) {
		Map<String,Object> map=null;
		map=jt.queryForMap(get_emp_no, empno);
		return map;
	}

}
