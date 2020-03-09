package com.nt.service;

import java.util.List;

import com.nt.dto.PhoneBookDto;

public interface PhoneBookService {
	public String insertService(PhoneBookDto dto);
	public List <PhoneBookDto>fetchAllservice();
	public PhoneBookDto getbyidservice(int sno);
	public String editbyidservice(PhoneBookDto dto);
	public String DeleteService(int sno);

}
