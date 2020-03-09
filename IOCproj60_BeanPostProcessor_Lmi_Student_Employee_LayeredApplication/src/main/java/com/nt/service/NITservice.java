package com.nt.service;

import com.nt.dto.EmployeeDto;
import com.nt.dto.StudentDto;

public interface NITservice {
	public String registerStudent(StudentDto dto);
	public String registerEmployee(EmployeeDto dto);

}
