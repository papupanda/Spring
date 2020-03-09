package com.nt.demo;

public class Test {
	
 public Test(){
	System.out.println("0 param constructor");
}
 public Test(int x) {
	 System.out.println("one param constructor");
 }
 static {
	 System.out.println("static block");
 }
@Override
public String toString() {
	return "Test []";
}
 
}
