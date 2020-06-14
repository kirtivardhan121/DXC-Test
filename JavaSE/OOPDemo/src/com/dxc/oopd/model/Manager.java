package com.dxc.oopd.model;

public class Manager extends Employee {

	private double allowence;
	
	public Manager() {
		//left if uninterrupted
	}

	public Manager(int empid, String name, double basic, double allowence) {
		super(empid, name, basic);
		this.allowence = allowence;
	}

	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}
	
	
	
	
}
