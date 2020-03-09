package com.nt.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	private int empno;
	private String empname;
	private String empaddrs;
	private double basicsalary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddrs() {
		return empaddrs;
	}
	public void setEmpaddrs(String empaddrs) {
		this.empaddrs = empaddrs;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double d) {
		this.basicsalary = d;
	}
	

}
