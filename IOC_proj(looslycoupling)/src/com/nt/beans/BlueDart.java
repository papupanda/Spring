package com.nt.beans;
	public class BlueDart implements Courier{
		public BlueDart() {
		   System.out.println("BlueDart.BlueDart()");
		}
		public final String deliver(int orderid) {
			return "BlueDart is ready to deliver produts of"+orderid;
		}

}
