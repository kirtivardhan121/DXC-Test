package com.dxc.oopd.model;

public class Item {

	private int itemCode;
	private String itemName;
	private double costPrice;
	private double sellingPrice;
	
	public Item() {
		//left unimplemented
	}

	public Item(int itemCode, String itemName, double costPrice, double sellingPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	
}
