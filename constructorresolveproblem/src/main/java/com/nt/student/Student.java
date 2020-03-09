package com.nt.student;

public class Student {
	private int sno;
	private String sname;
	private float avg;
	public Student(int sno, String sname, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}
	
	

}
