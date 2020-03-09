package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDto;

public interface StudentService {
	public String Register(StudentDto dto);
	public List<StudentDto> UpdateAll();
	public StudentDto getByid(int sid);
	public String ModifyStudentByNo(StudentDto dto);
	public String RemoveStudentById(int sid);

}
