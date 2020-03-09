package com.nt.beans;

public class B {
	A a;
	public B(A a) {
		System.out.println("B.1-param construtor");
		this.a=a;
	}
	@Override
	public String toString() {
		return "B []";
	}
	

}
