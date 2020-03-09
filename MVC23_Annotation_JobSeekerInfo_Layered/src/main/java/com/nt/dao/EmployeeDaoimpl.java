
package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBo;

@Repository("dao")
public final class EmployeeDaoimpl implements EmployeeDao {
	private static final String GET_ALL_JOB_OPENINGS="SELECT NO,NAME,ADDRS,AGE,SKILL,EXPERIENCE ,LOCATION,EXCEPTEDSALARY FROM JOBSEEKER";
	@Autowired
	private JdbcTemplate jt;

	
	public EmployeeDaoimpl(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public List<EmployeeBo> getAllJobOpening() {
		List<EmployeeBo> listbo=null;
		//execute the query
		listbo=jt.query(GET_ALL_JOB_OPENINGS,new JobDetailExtractor());
		
		return listbo;
	
	}
	private  class JobDetailExtractor implements ResultSetExtractor<List<EmployeeBo>> {

		@Override
		public List<EmployeeBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBo> listbo=null;
			EmployeeBo bo=null;
			//process the result set
			listbo=new ArrayList<EmployeeBo>();
			while(rs.next()) {
				bo=new EmployeeBo();
				bo.setNo(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setAddrs(rs.getString(3));
				bo.setAge(rs.getFloat(4));
				bo.setSkill(rs.getString(5));
				bo.setExperience(rs.getFloat(6));
				bo.setLocation(rs.getString(7));
				bo.setExceptedsalary(rs.getFloat(8));
				listbo.add(bo);
			}
			return listbo;
		}
	}
	
}

