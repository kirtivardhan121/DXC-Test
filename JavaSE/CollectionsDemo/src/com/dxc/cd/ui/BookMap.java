package com.dxc.cd.ui;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.dxc.cd.model.Book;
import com.dxc.cd.model.Category;

public class BookMap {

	public static void main(String[] args) {
		
		Map<String, Book> books = new TreeMap<String, Book>();
		
		books.put("105", (new Book("105","Let Us c","Yaswanth",250,Category.TEXT_BOOK)));
		books.put("104", (new Book("104","Let Us c++","Yaswanth",550,Category.TEXT_BOOK)));
		books.put("105", (new Book("105","Let Us c","Yaswanth",250,Category.TEXT_BOOK)));
		books.put("103", (new Book("103","Wings Of Fire","Abdul Kalam",5050,Category.TEXT_BOOK)));
		books.put("101", (new Book("101","Hounds Of Baskervalli","Watson",250,Category.NOVEL)));
		books.put("102", (new Book("102","Worst Nightmare","K. Rajin Naik",125,Category.COMIC)));
		
		for(Book b: books.values()) {
			System.out.println(b);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bcode to search: ");
		String bcode = sc.nextLine();
		
		if(books.containsKey(bcode)) {
			System.out.println("Book Found ");
		} else {
			System.out.println("Book Not found");
		}
		
		sc.close();
	}
}
