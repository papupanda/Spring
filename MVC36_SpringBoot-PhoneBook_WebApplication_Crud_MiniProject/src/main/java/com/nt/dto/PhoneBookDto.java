package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class PhoneBookDto implements Serializable {
	private int sno;
	private String name;
	private String email;
	private long phonenumber;


}
