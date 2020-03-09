package com.nt.strategy;

public class Vehicle {
	private Engine eng;

	public Vehicle(Engine eng) {
		this.eng = eng;
	}
	public void journey(String source,String destination) {
		eng.start();
		System.out.println("journey starts from "+source);
		System.out.println("journey going is going to"+ source +"from"+destination);
		System.out.println("journy is complete finally reached "+destination);
		eng.end();
	}
	//factory method
		public static Vehicle getInstance(String engineType) {
			Engine eng=null;
			Vehicle vehicle=null;
			if(engineType.equalsIgnoreCase("disel")) 
				eng=new Disel_engine();
			else if(engineType.equalsIgnoreCase("petrol"))
					eng=new Petrol_engine();
			else if(engineType.equalsIgnoreCase("water"))
				eng=new Water_engine();
			else 
				throw new IllegalArgumentException("engine name is invalid");
				//create target class object
				vehicle=new Vehicle(eng);
				
			
			return vehicle;
			}
		}

		
	





	