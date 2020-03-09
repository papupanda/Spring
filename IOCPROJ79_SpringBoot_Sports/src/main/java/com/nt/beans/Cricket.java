package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cric")
@Primary
public class Cricket implements Sports {
	public Cricket() {
		System.out.println("Cricket.0 param ");
	}

	@Override
	public String equipment() {
		
		return "Criket::bat,ball,pad,gloves,umpaire";
	}

	@Override
	public String toString() {
		return "Cricket []";
	}
	

	

}
