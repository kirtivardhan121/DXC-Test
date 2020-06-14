package com.dxc.cd.model;


public class Item implements Comparable<Item>{

	private int iCode;
	private String iname;
	private double price;
	private String packageDate;
	private String expiryDate;
	private FoodCategory category;

	public Item() {
		//left unimplemented
	}

	public Item(int iCode, String iname, double price, String packageDate, String expiryDate, FoodCategory category) {
		super();
		this.iCode = iCode;
		this.iname = iname;
		this.price = price;
		this.packageDate = packageDate;
		this.expiryDate = expiryDate;
		this.category = category;
	}

	public int getiCode() {
		return iCode;
	}

	public void setiCode(int iCode) {
		this.iCode = iCode;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPackageDate() {
		return packageDate;
	}

	public void setPackageDate(String packageDate) {
		this.packageDate = packageDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public FoodCategory getCategory() {
		return category;
	}

	public void setCategory(FoodCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item [iCode=" + iCode + ", iname=" + iname + ", price=" + price + ", packageDate=" + packageDate
				+ ", expiryDate=" + expiryDate + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Item o) {
		Integer icode1 = this.iCode;
		Integer icode2 = o.iCode;
		return icode1.compareTo(icode2);
	}
}


