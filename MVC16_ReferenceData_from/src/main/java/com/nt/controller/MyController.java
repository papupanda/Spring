package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegistrationCommand;

public class MyController extends SimpleFormController {
	@Override
	public Map referenceData(HttpServletRequest request, Object command, Errors errors) throws Exception {
		System.out.println("reference data");
		Map<String,List<String>> map=null;
		List<String> countieslist=null;
		List<String> courseList=null;
		List<String> hobieslist=null;
		map=new HashMap();
		//course and add dynamically
		countieslist=new ArrayList();
		countieslist.add("india");
		countieslist.add("srilanka");
		countieslist.add("nepal");
		countieslist.add("pakistan");
		map.put("countries", countieslist);
		//course and add dynamically
		courseList=new ArrayList();
		courseList.add("java");
		courseList.add("c");
		courseList.add("oracle");
		courseList.add("c++");
		map.put("course",courseList);
		//course and add dynamically
		hobieslist=new ArrayList();
		hobieslist.add("sleeping");
		hobieslist.add("eating");
		hobieslist.add("dancing");
		hobieslist.add("watching tv");
		map.put("hobies", hobieslist);
		return map;
		
		
		
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("MyController.onSubmit()");
		return new ModelAndView("result","cmdData",(RegistrationCommand)command);
	}
}
