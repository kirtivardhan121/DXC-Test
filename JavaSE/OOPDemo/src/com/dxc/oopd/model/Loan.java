package com.dxc.oopd.model;

public abstract class Loan {

	private double principle;
	private double timePeriod;
	private double rateOfInterest;
	
	public Loan() {
		//left unimplemented
	}

	public Loan(double principle, double timePeriod, double rateOfInterest) {
		super();
		this.principle = principle;
		this.timePeriod = timePeriod;
		this.rateOfInterest = rateOfInterest;
	}

	public abstract double getPayableAmount();
	
	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(double timePeriod) {
		this.timePeriod = timePeriod;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
}//end of Loan
