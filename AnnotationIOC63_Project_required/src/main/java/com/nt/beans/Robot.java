package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	@Required
	public void setType(String type) {
		this.type = type;
	}
	

}
