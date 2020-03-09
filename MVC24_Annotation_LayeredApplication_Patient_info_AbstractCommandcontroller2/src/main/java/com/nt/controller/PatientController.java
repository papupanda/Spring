package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.PatientInputCommand;
import com.nt.dto.PatientInputDto;
import com.nt.dto.PatientResultDto;
import com.nt.service.PatientService;

@Controller("controller")
public class PatientController  {
	@Autowired
	private PatientService service;

	
       @RequestMapping("/search.htm")
	   public String handle(Map<String,Object>map,@ModelAttribute("searchCmd")PatientInputCommand cmd)throws Exception{ 
		PatientInputDto idto=null;
		idto=new PatientInputDto();
		List<PatientResultDto> listdto=new ArrayList<PatientResultDto>();
		//convert command to dto
		BeanUtils.copyProperties(((PatientInputCommand)cmd), idto);
		//use service
		listdto=service.Search(idto);
		map.put("listdto", listdto);
		//return mav object
		return "Show_view";
	}

}
