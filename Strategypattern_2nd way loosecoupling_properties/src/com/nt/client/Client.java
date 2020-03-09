package com.nt.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.strategy.Vehicle;
import com.nt.strategy.VehicleFactory;

public class Client {
	
	public static void main(String[] args) throws IOException {
		InputStream is=new FileInputStream("src/com/nt/common/application.properties");
		Properties props=new Properties();
		props.load(is);
		String engineMode=props.getProperty("engineType");
		Vehicle vehicle=null;
		vehicle=VehicleFactory.getInstance(engineMode);
		vehicle.journey("hyd", "banglore");
	}

}
