package com.nt.service;

import java.util.List;

import com.nt.dto.PatientInputDto;
import com.nt.dto.PatientResultDto;

public interface PatientService {
	public List<PatientResultDto> Search(PatientInputDto dto);

}
