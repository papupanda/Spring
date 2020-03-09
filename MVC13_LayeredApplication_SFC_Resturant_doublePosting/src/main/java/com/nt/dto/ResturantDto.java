package com.nt.dto;

import java.io.Serializable;

public class ResturantDto implements Serializable {
	private int itemno;
	private String itemname;
	private String catagory;
	private int price;
	private String availabe;
	public int getItemno() {
		return itemno;
	}
	public void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAvailabe() {
		return availabe;
	}
	public void setAvailabe(String availabe) {
		this.availabe = availabe;
	}
	
	

}


