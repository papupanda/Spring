package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.TourismDto;
import com.nt.service.Tourismservice;

@Controller("controller")
@Lazy
public class TourismController {
	@Autowired
	private Tourismservice service;

	
	public List<TourismDto>getAllStatesPlaces(String states[])throws Exception
	{
		System.out.println("TourismController.getAllStatesPlaces()");
		List<TourismDto> listdto=null;
		//use service
		listdto=service.getAllPlace(states);
		return listdto;
	}

}
