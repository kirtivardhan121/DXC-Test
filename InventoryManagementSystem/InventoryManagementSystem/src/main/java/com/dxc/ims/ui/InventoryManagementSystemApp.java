package com.dxc.ims.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.dxc.ims.exception.InventoryException;
import com.dxc.ims.model.Item;
import com.dxc.ims.service.ItemService;
import com.dxc.ims.service.ItemServiceImpl;

public class InventoryManagementSystemApp {

	private static Scanner kbScanner; // Key board scanner
	private static ItemService itemService; // service object offers operations related to item

	private static final String DATE_FORMAT = "dd-MM-yyyy";

	private static void doAddItem() {
		Item item = new Item();
		System.out.print("Icode>> ");
		while (!kbScanner.hasNextInt()) {
			System.out.println("A non-fractional number expected!");
			System.out.print("Icode>> ");
		}
		item.setIcode(kbScanner.nextInt());
		System.out.print("Name>> ");
		item.setIname(kbScanner.next());
		System.out.print("Price>> ");
		while (!kbScanner.hasNextDouble()) {
			System.out.println("A fractional number expected !");
			System.out.print("Price>> ");
		}
		item.setPrice(kbScanner.nextDouble());
		System.out.print("PackageDate(" + DATE_FORMAT + ")>> ");
		String pdStr = kbScanner.next();
		item.setPackageDate(LocalDate.parse(pdStr, DateTimeFormatter.ofPattern(DATE_FORMAT)));

		try {
			itemService.addItem(item);
			System.out.println("Item is Saved!");
		} catch (InventoryException e) {
			System.out.println(e.getMessage());
		}
	}



	private static void doDisplayItems() {

		try {
			List<Item> itemsList = itemService.getAllItems();
			if (itemsList == null || itemsList.size() == 0) {
				System.out.println("No Item Records Yet! Try adding few ");
			} else {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT);
				System.out.println("ICODE\tName\tPrice\tPackageDate");
				System.out.println("==================================================");
				for (Item item : itemsList) {
					System.out.println(item.getIcode() + "\t" + item.getIname() + "\t" + item.getPrice() + "\t"
							+ item.getPackageDate().format(dtf));
				}
			}
		} catch (InventoryException exp) {
			System.out.println(exp.getMessage());
		}
	}



	private static void doDeleteItem() {
		System.out.print("Icode>> ");
		while (!kbScanner.hasNextInt()) {
			System.out.println("A non-fractional number expected!");
			System.out.print("Icode>> ");
		}
		int icode = kbScanner.nextInt();
		try {
			itemService.deleteItem(icode);
			System.out.println("Item got deleted!");
		} catch (InventoryException e) {
			System.out.println(e.getMessage());
		}
	}



	public static void main(String[] args) {
		kbScanner = new Scanner(System.in);
		try {
			itemService = new ItemServiceImpl();
		} catch (InventoryException e) {
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



			if (ordinal >= 0 && ordinal < Menu.values().length) {
				menu = Menu.values()[ordinal];
			} else {
				System.out.println("Invalid Choice");
				continue;
			}



			switch (menu) {
			case ADD:
				doAddItem();
				break;
			case DELETE:
				doDeleteItem();
				break;
			case DISPLAY:
				doDisplayItems();
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

