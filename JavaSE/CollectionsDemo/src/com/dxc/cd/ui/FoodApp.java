package com.dxc.cd.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import com.dxc.cd.model.FoodCategory;
import com.dxc.cd.model.Item;
import com.dxc.cd.service.ItemCategoryComparator;
import com.dxc.cd.service.ItemExpiryDateComparator;
import com.dxc.cd.service.ItemPriceComparator;

public class FoodApp {

	public static void main(String[] args) {
		
		Set<Item> i1 = new TreeSet<>();
		
		i1.add(new Item(102, "Pepsi", 50, "12-29-2016", "12-29-2016", FoodCategory.DRINK));
		i1.add(new Item(101, "Lays", 20, "08-11-2019", "08-10-2019", FoodCategory.READY_TO_EAT));
		i1.add(new Item(103, "Boat", 20, "07-10-2019", "09-08-2019", FoodCategory.DRINK));
		i1.add(new Item(106, "kurkure", 10, "05-09-2019", "05-09-2019", FoodCategory.FOOD));
		i1.add(new Item(105, "Biscuits", 100, "04-08-2019", "02-05-2019", FoodCategory.READY_TO_EAT));
		
		for(Item i: i1) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------");
		
		List<Item> i2 = new ArrayList<Item>();
		i2.addAll(i1);
		
		for(Item s: i2) {
			System.out.println(s);
		}
		
		System.out.println("--------------Expiry Date-----------------------");
		
		List<Item> i3 = new ArrayList<Item>();
		i3.addAll(i1);
		Collections.sort(i3, new ItemExpiryDateComparator());
		
		for(Item s1: i3) {
			System.out.println(s1);
		}
		
		System.out.println("----------------Category---------------------");
		
		List<Item> i4 = new ArrayList<Item>();
		i4.addAll(i1);
		Collections.sort(i4, new ItemCategoryComparator());
		
		for(Item s2: i4) {
			System.out.println(s2);
		}
		
		System.out.println("----------------Price---------------------");
		
		List<Item> i5 = new ArrayList<Item>();
		i5.addAll(i1);
		Collections.sort(i5, new ItemPriceComparator());
		
		for(Item s3: i5) {
			System.out.println(s3);
		}
		
		System.out.println("-------------------------------------------");
	}
}
