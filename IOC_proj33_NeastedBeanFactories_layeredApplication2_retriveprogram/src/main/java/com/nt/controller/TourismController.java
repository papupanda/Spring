package com.nt.controller;

import java.util.List;

import com.nt.dto.TourismDto;
import com.nt.service.Tourismservice;

public class TourismController {
	private Tourismservice service;

	public TourismController(Tourismservice service) {
		System.out.println("TourismController.1 param constructor");
		this.service = service;
	}
	public List<TourismDto>getAllStatesPlaces(String states[])throws Exception
	{
		System.out.println("TourismController.getAllStatesPlaces()");
		List<TourismDto> listdto=null;
		//use service
		listdto=service.getAllPlace(states);
		return listdto;
	}

}
