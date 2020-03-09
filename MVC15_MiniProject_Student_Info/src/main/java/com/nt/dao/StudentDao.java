package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBo;

public interface StudentDao {
	public int insert(StudentBo bo);
	public List<StudentBo> FetchAll();
	public StudentBo getStudentid(int sid);
	public int updateStudentByid(StudentBo bo);
	public int DeleteStudentByid(int sid);

}
