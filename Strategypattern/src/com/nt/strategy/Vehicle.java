package com.nt.strategy;

public class Vehicle {
	private Engine eng;

	public Vehicle(Engine eng) {
		this.eng = eng;
	}
	public void journey(String source,String destination) {
		eng.start();
		System.out.println("journey starts from "+source);
		System.out.println("journey going is going to"+ source +"from"+destination);
		System.out.println("journy is complete finally reached "+destination);
		eng.end();
	}
	

}
