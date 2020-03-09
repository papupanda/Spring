package com.nt.beans;

public class LoanDetails {
	private int LoanId;
	private String LoanType;
	private String customer;
	
	//setter and getter
	public LoanDetails() {
		System.out.println("LoanDetails:0 param constructor");
	}
	public int getLoanId() {
		return LoanId;
	}

	public void setLoanId(int loanId) {
		LoanId = loanId;
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LoanDetails [LoanId=" + LoanId + ", LoanType=" + LoanType + ", customer=" + customer + "]";
	}

	
	
	

}
