package com.nt.beans;

public class B {
	private A a;
	public B(A a) {
		this.a=a;
		System.out.println("1 -param construtor");
		
	}
		
	@Override
	public String toString() {
		return "B []";
	}
	

}
