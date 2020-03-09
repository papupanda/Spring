package com.nt.dao;

import java.util.List;

import com.nt.bo.PatientInputBo;
import com.nt.bo.PatientResultBo;

public interface PatientSearchDao {
	public List<PatientResultBo>find(PatientInputBo bo);

}
