package com.nt.servlet;

import java.lang.reflect.Constructor;

import com.nt.test.Demo;

public class Test {

	public static void main(String[] args) {
		Class c=null;
		Constructor cons[]=null;
		Demo d1=null,d2=null;
		try {
			//class loading
			c=Class.forName("com.nt.test.Demo");
			//get all the constructor of the object
			cons=c.getDeclaredConstructors();
			//get access to private constructor
			cons[0].setAccessible(true);
			d1=(Demo)cons[0].newInstance();
			System.out.println(d1);
			System.out.println(".................");
			//get access to private constructor
			cons[1].setAccessible(true);
			d2=(Demo)cons[1].newInstance(10,20);
			System.out.println(d2);
			
			
		}
		catch(ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		

	}

}
