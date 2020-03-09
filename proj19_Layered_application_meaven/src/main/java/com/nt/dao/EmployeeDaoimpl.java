package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBo;

public class EmployeeDaoimpl implements EmployeeDao {
	private static final String employee_query="INSERT INTO  EMPLOYEELAYERED VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;

	public EmployeeDaoimpl(DataSource ds) {
		this.ds = ds;
	}

	public int insert(EmployeeBo bo) throws Exception {
		//create connection
		try {
		con=ds.getConnection();
		//create prepared staement
		ps=con.prepareStatement(employee_query);
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
