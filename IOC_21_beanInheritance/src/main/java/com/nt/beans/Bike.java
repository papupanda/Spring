package com.nt.beans;

public class Bike {
	private String bikeno;
	private String bikename;
	private String bikecompany;
	private String bikecolor;
	private String bikecc;
	private String bikeengine;
	private String biketankoil;

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public void setBikeno(String bikeno) {
		this.bikeno = bikeno;
	}
	public void setBikecompany(String bikecompany) {
		this.bikecompany = bikecompany;
	}
	public void setBikecolor(String bikecolor) {
		this.bikecolor = bikecolor;
	}
	public void setBikecc(String bikecc) {
		this.bikecc = bikecc;
	}
	public void setBikeengine(String bikeengine) {
		this.bikeengine = bikeengine;
	}
	public void setBiketankoil(String biketankoil) {
		this.biketankoil = biketankoil;
	}
	@Override
	public String toString() {
		return "Bike [bikeno=" + bikeno + ", bikename=" + bikename + ", bikecompany=" + bikecompany + ", bikecolor="
				+ bikecolor + ", bikecc=" + bikecc + ", bikeengine=" + bikeengine + ", biketankoil=" + biketankoil
				+ "]";
	}
	
	
}
