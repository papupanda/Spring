package com.nt.beans;

import org.springframework.stereotype.Component;


public class Bank {
	public float calclntrAmt(float pamt,float time) {
		System.out.println("Bank.calclntrAmt()");  
		return pamt*time*2.0f/100;
	}

}
