package com.nt.service;

import com.nt.external.ICCScoreComp;

public class CricBuzzServiceimpl implements CricBuzzService {
	private ICCScoreComp isc; 

	public CricBuzzServiceimpl(ICCScoreComp isc) {
		System.out.println("CricBuzzServiceimpl.CricBuzzServiceimpl()");
		this.isc = isc;
	}

	@Override
	public String getScore(int mid) throws IllegalArgumentException {
		String Score=null;
		Score=isc.findScore(mid);
		return Score;
	}

}
