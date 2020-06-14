package com.dxc.oopd.model;

public class ManagingDirector extends Manager {

	private double share;
	
	public ManagingDirector() {
		//left uninterrupted
	}

	public ManagingDirector(int empid, String name, double basic, double allowence, double share) {
		super(empid, name, basic, allowence);
		this.share = share;
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}
	
	
}
