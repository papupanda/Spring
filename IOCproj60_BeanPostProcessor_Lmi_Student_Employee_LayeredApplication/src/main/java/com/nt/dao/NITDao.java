package com.nt.dao;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;

public interface NITDao {
	public int insertStudent(StudentBo bo);
	public int insertEmployee(EmployeeBo bo);

}
