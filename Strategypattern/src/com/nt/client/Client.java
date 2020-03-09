package com.nt.client;

import com.nt.strategy.Engine;
import com.nt.strategy.Vehicle;
import com.nt.strategy.Water_engine;

public class Client {
	
	public static void main(String[] args) {
		Engine eng=null;
		Vehicle v=null;
	//create dependency class object
		eng=new Water_engine();
		//creating target class object
		v=new Vehicle(eng);
		//call business method
		v.journey("hyd", "bangolre");
		
		

	}

}
