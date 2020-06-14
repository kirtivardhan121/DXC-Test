package com.dxc.ld.ui;

import com.dxc.ld.model.Book;
import com.dxc.ld.model.Category;

public class BookApplication {

	public static void main(String[] args) {

		Book[] books = new Book[] {
				new Book("101","Let Us C","Yaswanth",524.25,Category.TEXT_BOOK),
				new Book("102","Let Us C++","Yaswanth",324.25,Category.TEXT_BOOK),
				null,
				new Book("103","The Hounds Of Baskervelli","Watson",1524.25,Category.NOVEL)
		};

		for(Book b : books) {
			if(b!=null) {
				System.out.println(b + "Cost of 10 books " + b.getPrice()*10);
			}//Defensive programming
			/*
			 * try { System.out.println(b + "Cost of 10 books " + b.getPrice()*10); }
			 * catch(NullPointerException exe) { System.err.println(exe.getMessage()); }
			 */
		}


	}

}
