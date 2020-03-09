package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RailTicketReservationController {
	
	@RequestMapping("/home.htm")
	public String showhome() {
		return "welcome";
	}
	@GetMapping("/status.htm")
	public  String  showPNR(Map<String,Object> map) {
		map.put("tktNo",new Random().nextInt(10000));
		map.put("status","Confirmed");
		return "show_pnr";
		
	}

}
