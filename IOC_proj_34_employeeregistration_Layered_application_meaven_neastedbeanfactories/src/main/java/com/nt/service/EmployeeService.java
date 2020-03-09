package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDto;

public interface EmployeeService {
	public List<EmployeeDto> getEmployeedata(String states[])throws Exception;

	}
