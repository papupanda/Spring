package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDto;

public interface EmployeeService {
	public String fetchall(EmployeeDto dto);
	public List<EmployeeDto> retrieve();
	public EmployeeDto getempbyid(int id);
	public String update(EmployeeDto dto);
	public String deletestudentbyid(int id);

}
