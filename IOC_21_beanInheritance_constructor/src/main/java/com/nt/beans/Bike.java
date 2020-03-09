package com.nt.beans;

public class Bike {
	private String bikeno;
	private String bikename;
	private String bikecompany;
	private String bikecolor;
	private String bikecc;
	private String bikeengine;
	private String biketankoil;
	public Bike(String bikeno, String bikename, String bikecompany, String bikecolor, String bikecc, String bikeengine,
			String biketankoil) {
		this.bikeno = bikeno;
		this.bikename = bikename;
		this.bikecompany = bikecompany;
		this.bikecolor = bikecolor;
		this.bikecc = bikecc;
		this.bikeengine = bikeengine;
		this.biketankoil = biketankoil;
	}
	

	/*public void setBikename(String bikename) {
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
	}*/
	@Override
	public String toString() {
		return "Bike [bikeno=" + bikeno + ", bikename=" + bikename + ", bikecompany=" + bikecompany + ", bikecolor="
				+ bikecolor + ", bikecc=" + bikecc + ", bikeengine=" + bikeengine + ", biketankoil=" + biketankoil
				+ "]";
	}
	
	
}
