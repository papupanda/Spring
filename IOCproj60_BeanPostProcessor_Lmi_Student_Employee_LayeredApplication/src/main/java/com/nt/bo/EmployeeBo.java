package com.nt.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeBo extends Basebo {
	private String dsg;
	private float exp;
	
	public EmployeeBo() {
		System.out.println("EmployeeBo.0 param constructor");
	}

	@Override
	public String toString() {
		return "EmployeeBo"+super.toString()+"[dsg=" + dsg + ", exp=" + exp + "]";
	}
	

}
