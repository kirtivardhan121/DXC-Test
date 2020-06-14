package com.dxc.oopd.model;

public class ConsumableItems extends Item {

	private double validity;
	
	public ConsumableItems() {
		//left unimplemented
	}

	public ConsumableItems(int itemCode, String itemName, double costPrice, double sellingPrice, double validity) {
		super(itemCode, itemName, costPrice, sellingPrice);
		this.validity = validity;
	}

	public double getValidity() {
		return validity;
	}

	public void setValidity(double validity) {
		this.validity = validity;
	}
	
	
}
