package com.nt.beans;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
@Named
public class Flipkart {
	

	//@Qualifier("dtdc")
	//@Named("dtdc")
	//@Autowired
	//@Inject
	//@Inject
	//@Named("dtdc")
	private Courier courier;
	@Inject
	private Date date;
	/*public void setCourier(Courier courier) {
		this.courier = courier;
	}*/


	
	//@Named("dtdc")
	//@Inject
	/*public Flipkart(@Named(value="dtdc") Courier courier, @Nullable Date date) {
		this.courier = courier;
		this.date=date;
	}*/


	/*public void setDate(Date date) {
		this.date = date;
	}*/
	//@Named("dtdc")
	@Inject
  /*public void assign(@Named(value="dtdc")Courier courier,@Nullable Date date) {
	  this.courier=courier;
	  this.date=date;
	  
  }*/

	@Override
	public String toString() {
		return "Flipkart [date=" + date + ", courier=" + courier + "]";
	}

	
	

}
