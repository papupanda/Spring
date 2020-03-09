package com.nt.target;

public class IntrAmtCalculator {
	public float calclntrAmt(float principle,float rate,float time) {
		System.out.println("Target class:method");
		return(principle*rate*time)/100.0f;
	}

}
