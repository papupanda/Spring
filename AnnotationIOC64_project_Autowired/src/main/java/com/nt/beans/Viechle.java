package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {
	@Autowired
	@Qualifier("e")
	private Engine engg;

	

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	

}
