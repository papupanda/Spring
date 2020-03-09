package com.nt.Cricket;

public class Professional {
	private String name;
	private String jaursyno;
	private Bat bat;
	public Professional() {
		
	}
	
	public Professional(String name,Bat bat) {
		this.name=name;
		this.bat=bat;
	}
	public void setJaursyno(String jaursyno) {
		this.jaursyno = jaursyno;
	}
	@Override
	public String toString() {
		return "Professional [name=" + name + ", jaursyno=" + jaursyno + ", bat=" + bat + "]";
	}
	
	
	

}
