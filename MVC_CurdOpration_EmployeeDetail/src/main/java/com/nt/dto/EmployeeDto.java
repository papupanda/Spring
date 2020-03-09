package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDto implements Serializable {
	private int id;    
	private String name;    
	private float salary;    
	private String designation; 

}
