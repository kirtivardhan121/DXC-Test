package com.dxc.sl.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Serializable{

	private int iCode;
	private String iName;
	private double price;
	private LocalDate packedDate;
	private ItemCategory category;
	
	public Item() {
		//left Unimplemented
	}

	public Item(int iCode, String iName, double price, LocalDate packedDate, ItemCategory category) {
		super();
		this.iCode = iCode;
		this.iName = iName;
		this.price = price;
		this.packedDate = packedDate;
		this.category = category;
	}

	public int getiCode() {
		return iCode;
	}

	public void setiCode(int iCode) {
		this.iCode = iCode;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPackedDate() {
		return packedDate;
	}

	public void setPackedDate(LocalDate packedDate) {
		this.packedDate = packedDate;
	}

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [iCode=" + iCode + ", iName=" + iName + ", price=" + price + ", packedDate=" + packedDate
				+ ", category=" + category + "]";
	}
	
	
}
