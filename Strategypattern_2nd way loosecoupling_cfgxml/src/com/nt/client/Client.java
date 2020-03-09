package com.nt.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.strategy.Disel_engine;
import com.nt.strategy.Engine;
import com.nt.strategy.Petrol_engine;
import com.nt.strategy.Vehicle;
import com.nt.strategy.Water_engine;

public class Client {
	
	public static void main(String[] args) {
		//locate Spring bean configuration file
				FileSystemResource res=new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
				
				XmlBeanFactory factory=new XmlBeanFactory(res);
			
				Vehicle vehicle=factory.getBean("factory",Vehicle.class);
				//call business method
				vehicle.journey("hyd", "banglore");


}
}

