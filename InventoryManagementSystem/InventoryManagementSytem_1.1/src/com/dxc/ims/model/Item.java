package com.dxc.ims.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Serializable{

	private int icode;
	private String iname;
	private double price;
	private LocalDate packageDate;
	
	public Item() {
		//left uniplemented
	}

	public Item(int icode, String iname, double price, LocalDate packageDate) {
		super();
		this.icode = icode;
		this.iname = iname;
		this.price = price;
		this.packageDate = packageDate;
	}

	public int getIcode() {
		return icode;
	}

	public void setIcode(int icode) {
		this.icode = icode;
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

	public LocalDate getPackageDate() {
		return packageDate;
	}

	public void setPackageDate(LocalDate packageDate) {
		this.packageDate = packageDate;
	}

	@Override
	public String toString() {
		return "Item [icode=" + icode + ", iname=" + iname + ", price=" + price + ", packageDate=" + packageDate + "]";
	}
}
