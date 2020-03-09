package com.nt.bo;

import java.util.Date;

import lombok.Data;
@Data
public abstract class Basebo {
	private int id;
	private String name;
	private String addrs;
	private Date doj;

}
