package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBo;

public class EmployeeDaoimpl implements EmployeeDao {
	private DataSource ds;
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;

	public EmployeeDaoimpl(DataSource ds) {
		System.out.println("EmployeeDaoimpl.1 param constructor");
		this.ds = ds;
	}

	public List<EmployeeBo>retrive(String cond) throws Exception {
		String employee_query="SELECT EMPNO,EMPNAME,EMPADDRS,BASICSALARY,GROSSSALARY,NETSALARY FROM  EMPLOYEELAYERED WHERE EMPNAME IN "+cond+" ORDER BY EMPNAME";
		EmployeeBo bo=null;
		List<EmployeeBo> listbo=null;
		ResultSet rs=null;
		//create connection
		try {
		con=ds.getConnection();
		//create prepared staement
		ps=con.prepareStatement(employee_query);
		rs=ps.executeQuery();
		//System.out.println(rs);
		listbo=new ArrayList();
		//get resultset
		while(rs.next()) {
			bo=new EmployeeBo();
			bo.setEmpno(rs.getInt(1));
			bo.setEmpname(rs.getString(2));
			bo.setEmpaddrs(rs.getString(3));
			bo.setBasicsalary(rs.getFloat(4));
			bo.setGrosssalary(rs.getFloat(5));
			bo.setNetsalary(rs.getFloat(6));
			listbo.add(bo);
		}
		
		}
		catch(SQLException se) {
			throw se;
		}
		return listbo;
	}

}
