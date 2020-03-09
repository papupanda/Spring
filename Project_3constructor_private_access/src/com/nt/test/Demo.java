package com.nt.test;

public class Demo {
	private int x=0;
	private int y=0;
	
	private Demo() {
		System.out.println("0 param constructor");
	}
	private Demo(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("parametric constructor");
		
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	

}
