/*
 * */

package com.nt.bo;

import lombok.Data;

/*
 * author satya
 */
@Data
public class TourismBo {
	
	int state_code;
	String state_name;
	String tourist_place;
	double package_amt;
     double net_amt;
	public TourismBo()
	{
		System.out.println("TourismBo:0-param Constructor");
	}
	
}
