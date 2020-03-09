package com.nt.Cricket;

public class Bat {
	private String name;
	private String model;

	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bat [name=" + name + ", model=" + model + "]";
	}
	
	
}
