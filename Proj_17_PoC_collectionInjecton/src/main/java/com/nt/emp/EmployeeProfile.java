package com.nt.emp;

import java.util.Properties;

public class EmployeeProfile {
	private Properties empDesg;

	public EmployeeProfile(Properties empDesg) {
		this.empDesg = empDesg;
	}

	@Override
	public String toString() {
		return "EmployeeProfile [empDesg=" + empDesg + "]";
	}
	

}
