package com.dxc.oopd.model;

public class Rectangular implements Hoarding {

	private double length;
	private double breadth;
	
	public Rectangular() {
		//left unimplemented
	}
	
	
	public Rectangular(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double getArea() {
		
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		
		return 2*(length+breadth);
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	
}
