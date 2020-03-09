package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
@Controller("contro")
public class EmployeeLoginController {
	@Autowired
	private EmployeeService service;
	
//initial request
	@GetMapping("/login.htm")
	public String ShowFrom(Map<String, Object>map) {
		EmployeeCommand cmd=null;
		//create object
		cmd=new EmployeeCommand();
		cmd.setUsername("papu");
		map.put("empcmd", cmd);
		return "login";	
	}
	//postback request
	@PostMapping("/login.htm")
	public String processFrom(Map<String, Object>map,@ModelAttribute("empcmd")EmployeeCommand cmd) {
		EmployeeDto dto=null;
		String result=null;
		//convert cmd to dto
		dto=new EmployeeDto();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		result=service.authenticate(dto);
		//keep result as model attribute
		map.put("result", result);
		map.put("empcmd", cmd);
		return "login_result";
		
		
	}
	@ModelAttribute("hobiesList")
	public List<String> populateHobies(){
		List<String> list=null;
		list=new ArrayList<String>();
		list.add("travelling");
		list.add("sleeping");
		list.add("gossiping");
		list.add("eating");
		list.add("drinking");
		list.add("singing");
		return list;
		
		
	}
	@ModelAttribute("emailDomainsList")
	public List<String> EmailDomain(){
		List<String> list=null;
		list=new ArrayList<String>();
		list.add("gmail");
		list.add("yahoo");
		list.add(".net");
		return list;
	}
	@ModelAttribute("countriesList")
	public List<String>populateCountries(){
		List<String> list=null;
		list=new ArrayList<String>();
		list.add("india");
		list.add("china");
		list.add("nepal");
		list.add("pakistan");
		list.add("afagnistan");
		return list;
	}

}
