package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.EmployeeCommand;
@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(EmployeeCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		EmployeeCommand cmd=null;
		//type casting
		cmd=(EmployeeCommand)target;
		if(cmd.getUsername()==null||cmd.getUsername().equals("")||cmd.getUsername().length()==0) {
			errors.rejectValue("username", "username.required");
		}
		if(cmd.getPassword()==null||cmd.getPassword().equals("")||cmd.getPassword().length()==0) {
			errors.rejectValue("password", "password.required");
		}
		

	}

}
