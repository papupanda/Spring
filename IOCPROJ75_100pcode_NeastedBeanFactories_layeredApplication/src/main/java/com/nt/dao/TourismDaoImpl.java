package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.TourismBo;

@Repository("dao")
public class TourismDaoImpl implements TourismDao {
	@Autowired
	private DataSource ds;
	

	public List<TourismBo> view(String cond) throws Exception {
		System.out.println("TourismDaoimpl.view");
		List<TourismBo> listbo=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		TourismBo bo=null;
		try {
			con=ds.getConnection();
			ps=con.prepareStatement("SELECT STATE_CODE,STATE_NAME,TOURIST_PLACE,PACKAGE_AMT,NET_AMT FROM TOURISM611 WHERE STATE_NAME IN "+cond+" ORDER BY STATE_NAME");
			//System.out.println(cond+"dao");
			rs=ps.executeQuery();
			//System.out.println(rs);
			listbo=new ArrayList();
			
			if(rs!=null) {
			while(rs.next()) {
				bo=new TourismBo();
				
				bo.setState_code(rs.getInt(1));
				bo.setState_name(rs.getString(2));
				bo.setTourist_place(rs.getString(3));
				bo.setPackage_amt(rs.getDouble(4));
				bo.setNet_amt(rs.getDouble(5));
				//System.out.println(bo);
				listbo.add(bo);
				
				//System.out.println(bo);
				
		}
			}
			else
			{
				System.out.println("Record Not Found");
			}
		}
		catch(SQLException se) {
			throw se;
		
	}
	return listbo;

}
}
