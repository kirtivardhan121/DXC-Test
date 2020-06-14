package com.dxc.oopd.model;

public class EducationalLoan extends Loan {

	private double subcidy;
	
	public EducationalLoan() {
		//left unimplemented
	}
	
	
	public EducationalLoan(double principle, double timePeriod, double rateOfInterest, double subcidy) {
		super(principle, timePeriod, rateOfInterest);
		this.subcidy = subcidy;
	}


	@Override
	public double getPayableAmount() {
		
		return getPrinciple() + ((getPrinciple()*getRateOfInterest()*getTimePeriod())/100)-subcidy;
	}


	public double getSubcidy() {
		return subcidy;
	}


	public void setSubcidy(double subcidy) {
		this.subcidy = subcidy;
	}

	
}
