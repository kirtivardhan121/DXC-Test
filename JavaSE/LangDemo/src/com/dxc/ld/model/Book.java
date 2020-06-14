package com.dxc.ld.model;

public class Book {

	private String bcode;
	private String name;
	private String author;
	private double price;
	private Category category;
	
	public Book() {
		//left unimplemented
	}

	public Book(String bcode, String name, String author, double price, Category category) {
		super();
		this.bcode = bcode;
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [bcode=" + bcode + ", name=" + name + ", author=" + author + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
}
