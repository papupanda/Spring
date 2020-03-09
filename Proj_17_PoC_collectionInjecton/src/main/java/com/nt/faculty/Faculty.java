package com.nt.faculty;

import java.util.Date;
import java.util.Map;

public class Faculty {
	private Map<String,String>facultySubject;
	private Map<String,Date>ImpDate;
	
	public Faculty() {
		System.out.println("Faculty.Faculty()");
	}
	public void setFacultySubject(Map<String, String> facultySubject) {
		this.facultySubject = facultySubject;
	}
	public void setImpDate(Map<String, Date> impDate) {
		ImpDate = impDate;
	}
	@Override
	public String toString() {
		return "Faculty [facultySubject=" + facultySubject + ", ImpDate=" + ImpDate + "]";
	}
	
	

}
