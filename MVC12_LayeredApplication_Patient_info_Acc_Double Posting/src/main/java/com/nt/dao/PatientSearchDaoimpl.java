package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.PatientInputBo;
import com.nt.bo.PatientResultBo;

public class PatientSearchDaoimpl implements PatientSearchDao {
	private static final String Patient_detail="SELECT PNO,PATIENTNAME,AGE,ADDRS,PROBLEM,WARDNO,DOCTOR FROM PATIENT_INFO WHERE  PATIENTNAME like ?  OR ADDRS like ? OR PROBLEM like ?";
	private JdbcTemplate jt;

	

	public PatientSearchDaoimpl(JdbcTemplate jt) {
		this.jt = jt;
	}



	public List<PatientResultBo> find(PatientInputBo bo) {
		List<PatientResultBo> listbo=null;
		listbo=new ArrayList<PatientResultBo>();
		
		listbo=(List<PatientResultBo>) jt.query(Patient_detail, 
				new RowMapperResultSetExtractor(new BeanPropertyRowMapper(PatientResultBo.class)),
				bo.getPatientname(),
				bo.getAddrs(),
				bo.getProblem()
				
				);	
		return listbo;
	}

	
	

}
