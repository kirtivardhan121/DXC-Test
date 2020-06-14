package com.dxc.cd.ui;

import java.util.Set;
import java.util.TreeSet;

import com.dxc.cd.model.Book;
import com.dxc.cd.model.Category;
import com.dxc.cd.service.BookTitleComparator;

public class BookSet {

	public static void main(String[] args) {

		Set<Book> books = new TreeSet<>();

		books.add(new Book("105","Let Us c","Yaswanth",250,Category.TEXT_BOOK));
		books.add(new Book("104","Let Us c++","Yaswanth",550,Category.TEXT_BOOK));
		books.add(new Book("105","Let Us c","Yaswanth",250,Category.TEXT_BOOK));
		books.add(new Book("103","Wings Of Fire","Abdul Kalam",5050,Category.TEXT_BOOK));
		books.add(new Book("101","Hounds Of Baskervalli","Watson",250,Category.NOVEL));
		books.add(new Book("102","Worst Nightmare","K. Rajin Naik",125,Category.COMIC));

		for(Book b:books) {
			System.out.println(b);
		}
		
		System.out.println("------------------------");
		
		Set<Book> books2 = new TreeSet<>(new BookTitleComparator());
		books2.addAll(books);
		
		for(Book b:books2) {
			System.out.println(b);
		}
		
		System.out.println("------------------------");
	}
}