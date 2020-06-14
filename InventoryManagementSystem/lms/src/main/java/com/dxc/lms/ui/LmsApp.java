package com.dxc.lms.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.dxc.lms.exception.BookException;
import com.dxc.lms.model.Book;
import com.dxc.lms.service.BookService;
import com.dxc.lms.service.BookServiceImpl;

public class LmsApp {

	private static Scanner kbScanner; //keyboard scanner
	private static BookService bookService;
	private static final String DATE_FORMAT = "dd-MM-yyyy";

	private static void doAddBooks() {
		Book book = new Book();
		System.out.print("Bcode>> ");
		while (!kbScanner.hasNextInt()) {
			System.out.println("A non-fractional number expected!");
			System.out.print("Bcode>> ");
		}
		book.setBcode(kbScanner.nextInt());
		System.out.print("Name>> ");
		book.setBname(kbScanner.next());
		
		System.out.print("Price>> ");
		while (!kbScanner.hasNextDouble()) {
			System.out.println("A fractional number expected !");
			System.out.print("Price>> ");
		}
		book.setPrice(kbScanner.nextDouble());
		System.out.print("PackageDate(" + DATE_FORMAT + ")>> ");
		String pdStr = kbScanner.next();
		book.setPackageDate(LocalDate.parse(pdStr, DateTimeFormatter.ofPattern(DATE_FORMAT)));

		try {
			bookService.addBook(book);
			System.out.println("Book is Saved!");
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void doDisplayBooks() {
		try {
			List<Book> booksList = bookService.getAllBooks();
			if (booksList == null || booksList.size() == 0) {
				System.out.println("No Item Records Yet! Try adding few ");
			} else {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT);
				System.out.println("BCODE\tName\tPrice\tPackageDate");
				System.out.println("==================================================");
				for (Book book : booksList) {
					System.out.println(book.getBcode() + "\t" + book.getBname() + "\t" + book.getPrice() + "\t"
							+ book.getPackageDate().format(dtf));
				}
			}
		} catch (BookException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doDeleteBook() {

		System.out.print("Bcode>> ");
		while (!kbScanner.hasNextInt()) {
			System.out.println("A non-fractional number expected!");
			System.out.print("Bcode>> ");
		}
		int bcode = kbScanner.nextInt();
		try {
			bookService.deleteBook(bcode);
			System.out.println("Book got deleted!");
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		kbScanner = new Scanner(System.in);
		try {
			bookService = new BookServiceImpl();
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}
		Menu menu = null;

		while (menu != Menu.QUIT) {
			System.out.println("Choice\tMenu");
			for (Menu m : Menu.values()) {
				System.out.println((m.ordinal() + 1) + "\t" + m);
			}
			System.out.print("Choice>> ");
			int choice = kbScanner.nextInt();
			int ordinal = choice - 1;



			if (ordinal >= 0 && ordinal < menu.values().length) {
				menu = Menu.values()[ordinal];
			} else {
				System.out.println("Invalid Choice");
				continue;
			}



			switch (menu) {
			case ADD:
				doAddBooks();
				break;
			case DELETE:
				doDeleteBook();
				break;
			case DISPLAY:
				doDisplayBooks();
				break;
			case QUIT:
				System.out.println("Application Closed");
				break;
			default:
				System.out.println("Invalid Chpice");
				break;
			}
		}

		kbScanner.close();
	}
}
