package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("player")
public class Player {
	@Autowired
	private Sports sport;

	public Player(Sports sport) {
		this.sport = sport;
	}
	public String playgame() {
		System.out.println("Player.playgame()");
		String equip=sport.equipment();
		return equip;
		
	}
	@Override
	public String toString() {
		return "Player [sport=" + sport + "]";
	}
	

}
