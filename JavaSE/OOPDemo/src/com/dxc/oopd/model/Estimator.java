package com.dxc.oopd.model;

public class Estimator {

	private double unitPaintRate;
	private double unitBoarderRate;
	
	private Estimator() {
		//left unimplemented
	}

	public double getPaintCost(Hoarding h) {
		return h.getArea()*unitPaintRate;
	}
	
	public double getBorderCost(Hoarding h) {
		return h.getPerimeter()*unitBoarderRate;
	}
	
	public Estimator(double unitPaintRate, double unitBoarderRate) {
		super();
		this.unitPaintRate = unitPaintRate;
		this.unitBoarderRate = unitBoarderRate;
	}

	public double getUnitPaintRate() {
		return unitPaintRate;
	}

	public void setUnitPaintRate(double unitPaintRate) {
		this.unitPaintRate = unitPaintRate;
	}

	public double getUnitBoarderRate() {
		return unitBoarderRate;
	}

	public void setUnitBoarderRate(double unitBoarderRate) {
		this.unitBoarderRate = unitBoarderRate;
	}
	
	
}
