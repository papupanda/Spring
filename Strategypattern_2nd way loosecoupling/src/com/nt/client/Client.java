package com.nt.client;

import com.nt.strategy.Disel_engine;
import com.nt.strategy.Engine;
import com.nt.strategy.Petrol_engine;
import com.nt.strategy.Vehicle;
import com.nt.strategy.Water_engine;

public class Client {
	
	public static void main(String[] args) {
		Vehicle vehicle=null;
		vehicle=Vehicle.getInstance("disel");
		vehicle.journey("hyd", "banglore");
	}

}
