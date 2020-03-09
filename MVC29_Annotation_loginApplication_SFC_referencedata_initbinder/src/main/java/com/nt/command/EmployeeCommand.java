package com.nt.command;

import lombok.Data;

@Data
public class EmployeeCommand {
	private String username;
	private String password;
	private String[] hobies=new String[] {"singing"};
	private String[] domains=new String[] {"gmail"};
	private String country="china";

}
