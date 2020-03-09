package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDto extends BaseDto{
	private String course;
	private String qualify;
	
	public StudentDto() {
		System.out.println("StudentDto.0 param constructor");
	}

	@Override
	public String toString() {
		return "StudentDto"+super.toString()+"[course=" + course + ", qualify=" + qualify + "]";
	}
	

}
