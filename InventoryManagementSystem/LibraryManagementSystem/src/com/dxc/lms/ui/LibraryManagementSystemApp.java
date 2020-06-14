package com.dxc.lms.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.dxc.lms.exception.LibraryException;
import com.dxc.lms.model.Book;
import com.dxc.lms.service.BookService;
import com.dxc.lms.service.BookServiceImpl;

public class LibraryManagementSystemApp {

	private static Scanner kbScanner;
	private static BookService bookService;
	private static final String DATE_FORMAT = "dd-MM-yyyy";

	private static void doAddBook() {

		Book book = new Book();
		System.out.println("bcode >>");
		while(!kbScanner.hasNextInt()) {
			System.out.println("Integer Expected");
			System.out.println("Bcode >>");
		}
		book.setBcode(kbScanner.nextInt());

		System.out.println("Name >>");
		book.setBname(kbScanner.next());

		System.out.println("Price >>"); 
		while(!kbScanner.hasNextDouble()) {
			System.out.println("A fractional number Expected");
			System.out.println("Price >>");
		}
		book.setPrice(kbScanner.nextDouble());

		System.out.print("PackageDate("+DATE_FORMAT+")>> ");
		String pdStr = kbScanner.next();
		book.setPackageDate(LocalDate.parse(pdStr, DateTimeFormatter.ofPattern(DATE_FORMAT)));

		try {
			bookService.addBook(book);
			System.out.println("Book is Saved!");
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void doDisplayBook() {

		List<Book> bookList = bookService.getAllBooks();

		if(bookList == null || bookList.size()==0) {
			System.out.println("No records found");
		} else {

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT);
			System.out.println("BCode\tName\tPrice\tPackageDate");
			System.out.println("=================================");
			for(Book book : bookList) {
				System.out.println(book.getBcode() +"\t"+ book.getBname() +"\t"+ book.getPrice() +"\t"+ book.getPackageDate().format(dtf));
			}
		}
	}
	private static void  doDeleteBook() {

		System.out.println("Bcode >>");
		while(!kbScanner.hasNextInt()) {
			System.out.println("Integer Expected");
			System.out.println("Bcode >>");
		}
		int bcode = kbScanner.nextInt();

		try {

			bookService.deleteBook(bcode);
			System.out.println("Item Got Deleted");
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		kbScanner = new Scanner(System.in);

		try {
			bookService = new BookServiceImpl();
		} catch (LibraryException e) {
			
			System.out.println(e.getMessage());
		}
		Menu menu = null;

		while(menu != Menu.QUIT) {

			System.out.println("Choice\tMenu");

			for(Menu m : Menu.values()) {
				System.out.println((m.ordinal()+1) +"\t"+ m);
			}

			System.out.println("Choice>> ");
			int choice = kbScanner.nextInt();
			int ordinal = choice-1;

			if(ordinal >= 0 && ordinal<menu.values().length) {
				menu = Menu.values()[ordinal];
			} else {
				System.out.println("Invalid choice");
				continue;
			}

			switch(menu) {
			case ADD: doAddBook(); break;
			case DELETE: doDeleteBook(); break;
			case DISPLAY: doDisplayBook(); break;
			case QUIT: System.out.println("Application Closed"); break;
			default: System.out.println("Invalid choice "); break;
			}
		}

		kbScanner.close();
	}
}
