package com.nt.command;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PhoneBookCommand implements Serializable {
	private int sno;
	@Size(min=4,message="name Required")
	private String name;
	@Size(min=1,message="Email Required")
	private String email;
	//@Min(value=10,message="Number must be 10 digit")
	private long phonenumber;



}
