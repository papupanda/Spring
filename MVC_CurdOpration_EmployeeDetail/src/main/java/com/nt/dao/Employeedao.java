package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBo;

public interface Employeedao {
	public int insert(EmployeeBo bo);
	public List<EmployeeBo> getAll();
	public EmployeeBo getEmployeeByid(int id);
	public int UpdateEmployeeDetail(EmployeeBo bo);
	public int deleteById(int id);

}
