package com.nt.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentBo extends Basebo{
	private String course;
	private String qualify;
	
	public StudentBo() {
		System.out.println("StudentBo.0 param constructor");
	}

	@Override
	public String toString() {
		return "StudentBo"+super.toString()+"[course=" + course + ", qualify=" + qualify + "]";
	}
	

}
