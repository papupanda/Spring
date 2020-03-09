package com.nt.command;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class EmployeeCommand {
	@NotBlank(message="username is mandatory")
	@Length(message="user must have min of 4 chars and max 10 chars",min=4,max=10)
	private String username;
	@NotBlank(message="password is mandatory")
	@Length(message="password must have min of 4 chars",min=4)
	private String password;

}
