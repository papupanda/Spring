package com.nt.command;

import java.io.Serializable;

import lombok.Data;

@Data
public class PhoneBookCommand implements Serializable {
	private int sno;
	private String name;
	private String email;
	private long phonenumber;



}
