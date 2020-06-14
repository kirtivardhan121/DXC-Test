package com.dxc.lms.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "allBooksQry", query = "SELECT b FROM Book b"),
	@NamedQuery(name = "bookQry", query = "SELECT b from Book b WHERE b.bcode=:bcode")
})
@Entity
@Table(name = "books")
public class Book implements Serializable{

	@Id
	@Column(name = "bcode")
	private int bcode;
	@Column(name = "bname", nullable = false)
	private String bname;
	@Column(name = "price", nullable = false )
	private double price;
	@Column(name = "pdate", nullable = true )
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
