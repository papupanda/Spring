package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.ResturantCommand;

public class ResturantValidation implements Validator {

	public boolean supports(Class<?> clazz) {
		
		//return clazz==ResturantCommand.class;
		
		return clazz.isAssignableFrom(ResturantCommand.class);
	}

	public void validate(Object target, Errors errors) {
		
	}

}
