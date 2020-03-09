package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable {
	private int eid;
	private String ename;
	private String desg;
	private float salary;
	

}
