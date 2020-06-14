package com.dxc.oopd.model;

public class ServicableItem extends Item {

	private double serviceCost;
	private double warranty;
	
	public ServicableItem() {
		//left unimplemented
	}

	public ServicableItem(int itemCode, String itemName, double costPrice, double sellingPrice, double serviceCost, double warranty) {
		super(itemCode, itemName, costPrice, sellingPrice);
		this.serviceCost = serviceCost;
		this.warranty = warranty;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}
	
	
}
