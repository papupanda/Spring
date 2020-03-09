package com.nt.bean;

import java.util.Set;

public class EnginerrCollege {
	private Set<String>subjects;

	
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "EnginerrCollege [subjects=" + subjects + "]";
	}
	

}
