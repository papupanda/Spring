package com.nt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor {
	private long start,end;

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retval=null;
		start=System.currentTimeMillis();
		//invocation of business method
		retval=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println(invocation.getMethod().getName()+"has taken"+(end-start)+"ms to complete execution");
		return retval;
	}

}
