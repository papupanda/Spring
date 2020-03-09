package com.nt.strategy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VehicleFactory {
	private static Properties props;
	static {
		try {
		InputStream is=new FileInputStream("src/com/nt/common/application.properties");
		props=new Properties();
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public static Vehicle getInstance(String engineType) {
		Engine eng=null;
		Vehicle vehicle=null;
		String engineClass=null;
		engineClass=props.getProperty(engineType);
		try {
			eng=(Engine) Class.forName(engineClass).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vehicle=new Vehicle(eng);
		return vehicle;
	}

}
