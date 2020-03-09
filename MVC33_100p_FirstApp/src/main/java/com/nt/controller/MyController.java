package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/welcome")
	public String first(Map<String, Object>map) {
		//keep data in model attribute
		map.put("sysdate", new Date());
		return "Home";
		
		
	}

}
