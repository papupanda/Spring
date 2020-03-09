package com.nt.service;

import java.util.Map;

public interface EmployeeMgmt {
	public int FindEmployeeCount();
	public float FindEmployeeSalaryByno(int empno);
	public Map findEmployeeDetailByNO(int empno);
	

}
