package com.dxc.oopd.model;

public class Circular implements Hoarding {

	private double radius;
	
	public Circular() {
		//left unimplemented
	}
	
	public Circular(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double getArea() {
		
		return PIE*radius*radius;
	}

	@Override
	public double getPerimeter() {
		
		return 2*PIE*radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}
