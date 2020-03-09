package com.nt.command;

public class RegisterCommand {
	private String name;
	private String addrs;
	private int age;
	private String domain;
	private float currentSalary;
	private float experience;
	private String prefferedLocation;
	private float expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public float getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(float currentSalary) {
		this.currentSalary = currentSalary;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getPrefferedLocation() {
		return prefferedLocation;
	}
	public void setPrefferedLocation(String prefferedLocation) {
		this.prefferedLocation = prefferedLocation;
	}
	public float getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(float expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", addrs=" + addrs + ", age=" + age + ", domain=" + domain
				+ ", currentSalary=" + currentSalary + ", experience=" + experience + ", prefferedLocation="
				+ prefferedLocation + ", expectedSalary=" + expectedSalary + "]";
	}
	
	

}
