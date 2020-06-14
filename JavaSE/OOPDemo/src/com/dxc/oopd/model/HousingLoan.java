package com.dxc.oopd.model;

public class HousingLoan extends Loan {

	private double interestWaveOff;
	
	public HousingLoan() {
		//left unimplemented
	}
	
	
	public HousingLoan(double principle, double timePeriod, double rateOfInterest, double interestWaveOff) {
		super(principle, timePeriod, rateOfInterest);
		this.interestWaveOff = interestWaveOff;
	}


	@Override
	public double getPayableAmount() {
		
		return getPrinciple() + (getPrinciple()*getTimePeriod()*(getRateOfInterest()-interestWaveOff));
	}


	public double getInterestWaveOff() {
		return interestWaveOff;
	}


	public void setInterestWaveOff(double interestWaveOff) {
		this.interestWaveOff = interestWaveOff;
	}

	
}
