package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.ResturantCommand;

public class ResturantValidator implements Validator {

	public boolean supports(Class<?> clazz) {
	
		return clazz.isAssignableFrom(ResturantCommand.class);
	}

	public void validate(Object command, Errors errors) {
		ResturantCommand cmd=null;
		cmd=new ResturantCommand();
		//type cast
		cmd=(ResturantCommand)command;
		if(cmd.getItemname()==null || cmd.getItemname().length()==0||cmd.getItemname().equals("")) {
		errors.rejectValue("itemname", "rstCmd.itemname.required");	
		}
		if(cmd.getCatagory()==null || cmd.getCatagory().length()==0||cmd.getCatagory().equals("")) {
			errors.rejectValue("catagory", "rstCmd.catagory.required");
		}
		else if(cmd.getPrice()<=0) {
			errors.rejectValue("price", "rstCmd.price.required");
		}
		if(cmd.getAvailabe()==null || cmd.getAvailabe().length()==0 ||cmd.getAvailabe().equals("")) {
			errors.rejectValue("availabe", "rstCmd.availabe.required");
		}
		

	}

}
