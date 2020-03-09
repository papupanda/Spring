package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.command.PhoneBookCommand;
import com.nt.dto.PhoneBookDto;
import com.nt.service.PhoneBookService;

@Controller("contro")
public class PhoneBookController {
	@Autowired
	private PhoneBookService service;
	
	@GetMapping("/insert.htm")
	public String Insert(@ModelAttribute("pbc")PhoneBookCommand cmd) {
		
		return "contact";
	}
	//insert data
	@PostMapping("/insert.htm")
	public String insertSave(RedirectAttributes attribute,@Valid@ModelAttribute("pbc")PhoneBookCommand cmd,BindingResult errors) {
	PhoneBookDto dto=null;
	String resultmsg=null;
	if(errors.hasErrors()) {
		return "contact";
	}
	//convert cmd to dto
	dto=new PhoneBookDto();
	BeanUtils.copyProperties(cmd,dto);
	//use service
	resultmsg=service.insertService(dto);
	attribute.addFlashAttribute("resultmsg", resultmsg);
		return "redirect:/post_result.htm";	
	}
	@GetMapping("/post_result.htm")
	public String ShowResultPage() {
		System.out.println("PhoneBookController.ShowResultPage()");
	return "show_result";	
	}
	//fetch All Data
	@RequestMapping("/fetch.htm")
	public String fetchController(Map<String, Object>map) {
		List<PhoneBookDto> listdto=new ArrayList<PhoneBookDto>();
		//use service
		listdto=service.fetchAllservice();
		map.put("listdto", listdto);
		return "Phone_Result";
	}
	@GetMapping("/edit.htm")
	public String edit(Map<String,Object>map,HttpServletRequest req) {
		int sno=0;
		PhoneBookDto dto=null;
		PhoneBookCommand cmd=null;
		sno=Integer.parseInt(req.getParameter("sno"));
		//use service
		dto=service.getbyidservice(sno);
		//convert dto to cmd
		cmd=new PhoneBookCommand();
		BeanUtils.copyProperties(dto, cmd);
		map.put("phb", cmd);
		return "edit_phonebook";
	}
	@PostMapping("/edit.htm")
	public String editsave(Map<String, Object>map,@ModelAttribute("phb")PhoneBookCommand cmd,BindingResult errors) {
	//variable initialise
		PhoneBookDto dto=null;
		List<PhoneBookDto> listdto=new ArrayList<PhoneBookDto>();
		String resultMsg=null;
		//convert cmd to dto
		dto=new PhoneBookDto();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		resultMsg=service.editbyidservice(dto);
	    listdto=service.fetchAllservice();
	    map.put("resultMsg", resultMsg);
	    map.put("listdto", listdto);
		return "Phone_Result";
	}
	//delete 
	@RequestMapping("/delete.htm")
	public String deletecontroller(Map<String,Object>map,HttpServletRequest req) {
		String resultMsgdelete=null;
		List<PhoneBookDto> listdto=null;
		//use service
		resultMsgdelete=service.DeleteService(Integer.parseInt(req.getParameter("sno")));
		listdto=service.fetchAllservice();
		map.put("resultMsgdelete", resultMsgdelete);
		map.put("listdto", listdto);
		return "Phone_Result";
		
	}
	

}
