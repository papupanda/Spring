package com.nt.command;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeCommand implements Serializable {
	private int id;    
	private String name;    
	private float salary;    
	private String designation; 

}
