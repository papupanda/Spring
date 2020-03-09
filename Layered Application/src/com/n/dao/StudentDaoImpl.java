package com.n.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBo;

public final class StudentDaoImpl implements StudentDao{
	private static final String STUDENT_INSERT_QUERY="INSERT INTO  LAYEREDSTUDENT VALUES(?,?,?,?,?)";	
 private DataSource ds;
 PreparedStatement ps=null;
 int result=0;
public StudentDaoImpl(DataSource ds) {
	this.ds = ds;
}
@Override
public int insert(StudentBo bo) throws Exception {
	//get pooled connection object from jdbc datasource object
	try {
	Connection con=ds.getConnection();
	ps=con.prepareStatement(STUDENT_INSERT_QUERY);
	//set value to query param
	ps.setInt(1, bo.getSno());
	ps.setString(2,bo.getSname());
	ps.setInt(3,bo.getTotal());
	ps.setFloat(4, bo.getAvg());
	ps.setString(5,bo.getResult());
	//exceute the result
	result=ps.executeUpdate();

	
	return result;
}
	catch(SQLException se) {
		return 0;
	}
	catch(Exception e) {
		return 0;
	}
}

}
	