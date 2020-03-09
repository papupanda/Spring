package com.nt.test;

import java.lang.reflect.Constructor;

public class RunTimeLoad {
	public static void main(String [] args) {
		Class c1=null,c2=null;
		Object obj1=null,obj2=null,obj3=null,obj4=null;
		Constructor cons[]=null,cons1[]=null;
		try {
		c1=Class.forName(args[0]);
		obj1=c1.newInstance();
		System.out.println(obj1);
		System.out.println("..........");
		c2=Class.forName(args[1]);
		obj2=c2.newInstance();
		System.out.println(obj2);
		System.out.println("..........");
		cons=c2.getDeclaredConstructors();
		obj3=cons[0].newInstance(100);
		System.out.println(obj3);
		System.out.println("...........");
		cons1=c1.getDeclaredConstructors();
		obj4=cons1[5].newInstance(119, 7, 17);
		System.out.println(obj4);
		System.out.println("...............");
		
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
