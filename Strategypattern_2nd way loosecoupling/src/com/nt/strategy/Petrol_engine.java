package com.nt.strategy;

public final class Petrol_engine implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol_engine.start()");
		
	}

	@Override
	public void end() {
		System.out.println("Petrol_engine.end()");
		
	}

}
