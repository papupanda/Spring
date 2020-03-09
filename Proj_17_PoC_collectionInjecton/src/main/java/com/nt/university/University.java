package com.nt.university;

import java.util.Arrays;
import java.util.List;

public class University {
	private List<String> course[];
	
	public University() {
		System.out.println("university 0 param constructor");
	}

	public void setCourse(List<String>[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "University [course=" + Arrays.toString(course) + "]";
	}
	

}
