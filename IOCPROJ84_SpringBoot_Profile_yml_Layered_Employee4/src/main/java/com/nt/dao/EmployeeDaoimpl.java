package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("dao")
public class EmployeeDaoimpl implements EmployeeDao {
	private static final String employee_query="INSERT INTO  EMPLOYEELAYERED VALUES(?,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;

	
	public int insert(EmployeeBo bo) throws Exception {
		//create connection
		try {
		con=ds.getConnection();
		//create prepared staement
		ps=con.prepareStatement(employee_query);
		System.out.println(ds);
		//set the value param
		ps.setInt(1,bo.getEmpno());
		ps.setString(2,bo.getEmpname());
		ps.setString(3,bo.getEmpaddrs());
		ps.setDouble(4,bo.getBasicsalary());
		ps.setDouble(5, bo.getGrosssalary());
		ps.setDouble(6, bo.getNetsalary());
		//execute the result
		result=ps.executeUpdate();
		
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("error dao");
		}
		return result;
	}

}
