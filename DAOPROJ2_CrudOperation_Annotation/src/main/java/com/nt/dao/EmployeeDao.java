package com.nt.dao;

import java.util.Map;

public interface EmployeeDao {
	public int getEmployeecount();
	public float getEmployeeSalaryByno(int empno);
	public Map<String,Object> getEmployeeByno(int empno);

}
