package com.nt.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
		//add model attribute
		map.put("empcmd", cmd);
		return "login";	
	}
	//postback request
	@PostMapping("/login.htm")
	public String processFrom(Map<String, Object>map,@Valid@ModelAttribute("empcmd")EmployeeCommand cmd,BindingResult errors) {
		EmployeeDto dto=null;
		String result=null;
		if(errors.hasErrors()) {
			return "login";
		}
		//convert cmd to dto
		dto=new EmployeeDto();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		result=service.authenticate(dto);
		//keep result as model attribute
		map.put("result", result);
		map.put("cmddata", cmd);
		return "login_result";
		
		
	}

}
