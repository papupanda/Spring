package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.PatientInputCommand;
import com.nt.dto.PatientInputDto;
import com.nt.dto.PatientResultDto;
import com.nt.service.PatientService;

public class PatientController extends AbstractCommandController {
	private PatientService service;

	public PatientController(PatientService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		PatientInputDto idto=null;
		idto=new PatientInputDto();
		List<PatientResultDto> listdto=new ArrayList<PatientResultDto>();
		//convert command to dto
		BeanUtils.copyProperties(((PatientInputCommand)command), idto);
		//use service
		listdto=service.Search(idto);
		//return mav object
		return new ModelAndView("Show_view","listdto",listdto);
	}

}
