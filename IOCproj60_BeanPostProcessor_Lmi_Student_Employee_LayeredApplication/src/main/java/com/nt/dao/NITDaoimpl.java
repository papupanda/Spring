package com.nt.dao;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;

public class NITDaoimpl implements NITDao {

	public int insertStudent(StudentBo bo) {
		System.out.println("NITDaoimpl.insertStudent()"+bo);
		
		return 1;
	}

	public int insertEmployee(EmployeeBo bo) {
		System.out.println("NITDaoimpl.insertEmployee()"+bo);
		
		return 1;
	}

}
