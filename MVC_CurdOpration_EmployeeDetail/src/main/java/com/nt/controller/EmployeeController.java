package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDto;
import com.nt.service.EmployeeService;
@Controller("contro")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/f.htm")
	public String first() {
		return "first";
	}
	
	//get initial request
	@GetMapping("/home.htm")
	public String getall(@ModelAttribute("empcmd")EmployeeCommand cmd) {
		return "welcome";
	}
	//postback request
	@PostMapping("/home.htm")
	public String handleemp(Map<String, Object> map,@ModelAttribute("empcmd")EmployeeCommand cmd) throws Exception{
		//declare variable
		EmployeeDto dto=null;
		String result=null;
		//create dto object
		dto=new EmployeeDto();
		//covert command to dto
		BeanUtils.copyProperties((EmployeeCommand)cmd, dto);
		//use service
		result=service.fetchall(dto);
		map.put("result", result);
		return "emp_result";
	}
	@RequestMapping("/result.htm")
	public String getcontroller(Map<String,Object> map) {
		List<EmployeeDto> listdto=new ArrayList<EmployeeDto>();
		//use service
		listdto=service.retrieve();
		map.put("listdto", listdto);
		return "result_empdetails";
	}
	//initial request
	@GetMapping("/edit.htm")
	public String FirstEdit(HttpServletRequest req, Map<String, Object> map) {
		int id=0;
		EmployeeDto dto=null;
		EmployeeCommand cmd=null;
		//read customer number 
		id=Integer.parseInt(req.getParameter("id"));
		//use service
		dto=service.getempbyid(id);
		//convert dto to cmd
	    cmd=new EmployeeCommand();
	    //System.out.println(dto.getId());
	    BeanUtils.copyProperties(dto,cmd);
	    //keep model class as attribute
	    map.put("empcmd", cmd);
	    //return logical view name
	   return "edit_emp";
		
	}
	//postback request
	@PostMapping("/edit.htm")
	public String formsaveedit(Map<String, Object>map,@ModelAttribute("empcmd")EmployeeCommand cmd,BindingResult errors) {
		//initialise variable
		EmployeeDto dto=null;
		List<EmployeeDto> listdto=null;
		String result=null;
		//convert dto to cmd
		dto=new EmployeeDto();
        BeanUtils.copyProperties(cmd,dto);
		//use service
		result=service.update(dto);
		listdto=service.retrieve();
		
		
		//add model attribute
		map.put("result", result);
		map.put("listdto", listdto);
		return "result_empdetails";
		
	}
	@RequestMapping("/delete.htm")
	public String delete(Map<String, Object>map,HttpServletRequest req) {
		String resultmsg=null;
		List<EmployeeDto> listdto=null;
		//use service
		resultmsg=service.deletestudentbyid(Integer.parseInt(req.getParameter("id")));
		listdto=service.retrieve();
		map.put("resultmsg", resultmsg);
		map.put("listdto", listdto);
		return "result_empdetails";
	}
	

}
