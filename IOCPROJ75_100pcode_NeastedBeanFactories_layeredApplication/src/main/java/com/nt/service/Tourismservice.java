package com.nt.service;

import java.util.List;

import com.nt.dto.TourismDto;

public interface Tourismservice {
	public List<TourismDto> getAllPlace(String states[])throws Exception;

}
