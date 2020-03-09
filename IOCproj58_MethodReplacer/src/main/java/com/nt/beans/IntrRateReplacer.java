package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate;
	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer.0 param constructor");
	}
	public void setRate(float rate) {
		this.rate=rate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrRateReplacer.reimplement()");
		System.out.println("object class"+obj.getClass());
		System.out.println("method name"+method.getName());
		System.out.println("method args"+Arrays.toString(args));
		if(method.getName().equals("calclntrAmt")) {
			float pamt=(Float)args[0];
			float time=(Float)args[1];
			return pamt*time*rate/100.0f;
			
		}
		else {
		
		return 0.0f;
	}
	}//reimppliment

}//class
