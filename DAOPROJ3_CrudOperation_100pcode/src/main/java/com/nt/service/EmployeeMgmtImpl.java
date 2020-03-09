package com.nt.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;

@Service("service")
public class EmployeeMgmtImpl implements EmployeeMgmt {
	private EmployeeDao dao;

	public EmployeeMgmtImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	public int FindEmployeeCount() {
		int count=0;
		//use dao
		count=dao.getEmployeecount();
		
		return count;
	}

	public float FindEmployeeSalaryByno(int empno) {
		float salary=0;
		//use dao
		salary=dao.getEmployeeSalaryByno(empno);
		return salary;
	}

	public Map findEmployeeDetailByNO(int empno) {
		Map<String,Object> map=null;
		//use dao
		map=dao.getEmployeeByno(empno);
		return map;
	}

}
