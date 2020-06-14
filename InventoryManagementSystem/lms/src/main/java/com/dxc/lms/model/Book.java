package com.dxc.lms.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{

	private int bcode;
	private String bname;
	private double price;
	private LocalDate packageDate;
	
	public Book() {
		//left unimplemented
	}

	public Book(int bcode, String bname, double price, LocalDate packageDate) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.price = price;
		this.packageDate = packageDate;
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
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
		return "Book [bcode=" + bcode + ", bname=" + bname + ", price=" + price + ", packageDate=" + packageDate + "]";
	}
	
	
}
