package com.nt.student;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private int mark[];
	private Date date[];

	public void setDate(Date[] date) {
		System.out.println("Student.date injection");
		this.date = date;
	}

	public Student() {
		System.out.println("0 param constructor");

	}

	public void setMark(int[] mark) {
		System.out.println("setter injection");
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [mark=" + Arrays.toString(mark) + ", date=" + Arrays.toString(date) + "]";
	}

}
