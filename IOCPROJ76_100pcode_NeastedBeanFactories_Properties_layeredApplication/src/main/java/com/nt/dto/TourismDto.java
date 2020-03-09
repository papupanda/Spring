
	/**
	 * 
	 */
	package com.nt.dto;

	import java.io.Serializable;

import lombok.Data;

	/**
	 * @author Parag Ranjan
	 *
	 */
	@SuppressWarnings("serial")
	@Data
	public class TourismDto implements Serializable
	{
		int srNo;
		int state_code;
		String state_name;
		String tourist_place;
		double package_amt;
	     double net_amt;
		/**
		 * 
		 */
		public TourismDto()
		{
			System.out.println("TourismDTO:0-param Constructor");
		}
		
	}



