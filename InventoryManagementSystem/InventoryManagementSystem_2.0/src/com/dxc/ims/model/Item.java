package com.dxc.ims.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="allItemsQry",query = "SELECT i FROM Item i"),
	@NamedQuery(name = "itemQry", query = "SELECT i from Item i WHERE i.icode=:icode")
})

@Entity
@Table(name = "items")
public class Item implements Serializable{

	@Id
	@Column(name = "icode")
	private int icode;
	@Column(name = "iname", nullable = false)
	private String iname;
	@Column(name = "price", nullable = false)
	private double price;
	@Column(name = "pdate", nullable = true)
	private LocalDate packageDate;
	
	public Item() {
		//left unimplemented
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
