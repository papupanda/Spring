package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("foot")
public class Football implements Sports {
	public Football() {
		System.out.println("Football.0 param ");
		
	}

	@Override
	public String equipment() {
		System.out.println("Football.equipment()");
		return "FootBall::ball,husil,umpaire";
	}

	@Override
	public String toString() {
		return "Football []";
	}
	

}
