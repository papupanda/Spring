package com.nt.bo;

public class PatientResultBo extends PatientInputBo {
	private int pno;
	private int age;
	private int wardno;
	private String doctor;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getWardno() {
		return wardno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

}
