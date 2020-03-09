package com.nt.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto extends BaseDto {
	private String dsg;
	private float exp;
	
	public EmployeeDto() {
		System.out.println("EmployeeDto.0 param constructor");
	}

	@Override
	public String toString() {
		return "EmployeeDto"+super.toString()+"[dsg=" + dsg + ", exp=" + exp + "]";
	}
	

}

