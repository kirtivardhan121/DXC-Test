package com.dxc.oopd.model;

public class ContractEmployee extends Employee {

	private double contractDuration;
	
	public ContractEmployee() {
		////left unimplemented
	}

	public ContractEmployee(int empid, String name, double basic, double contractDuration) {
		super(empid, name, basic);
		this.contractDuration = contractDuration;
	}

	public double getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(double contractDuration) {
		this.contractDuration = contractDuration;
	}
	
	
}
