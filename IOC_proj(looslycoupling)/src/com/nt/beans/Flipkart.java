package com.nt.beans;

import java.util.Random;

public class Flipkart {
private Courier courier;

//constructor  injection
public Flipkart(Courier courier) {
	System.out.println("Flipkart.Flipkart()");
	this.courier=courier;
}
public String purchase(String item[]) {
	//generate order id
	Random rad=new Random();
	int orderid=rad.nextInt(700000);
	//deliver order
	String status=courier.deliver(orderid);
	return status+"Bill amt for order id"+orderid+" is 7000";
}//method
}//class
