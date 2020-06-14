package com.dxc.sl.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.stream.Collectors;

import com.dxc.sl.model.Item;
import com.dxc.sl.model.ItemCategory;

public class ItemStream {

	public static void main(String[] args) {

		List<Item> itemList = new ArrayList<Item>() {{
			add(new Item(101, "Apples", 100, LocalDate.now(), ItemCategory.RTE));
			add(new Item(101, "Mangoes", 1000, LocalDate.now(), ItemCategory.RTE));
			add(new Item(101, "Banana", 50, LocalDate.now(), ItemCategory.RTE));
			add(new Item(101, "Chana Dal", 150, LocalDate.now(), ItemCategory.FOOD));
			add(new Item(101, "Colddrink", 90, LocalDate.now(), ItemCategory.BEVERAGE));
		}};

		System.out.println(itemList);

		List<String> itemNames = itemList.stream().map(item -> item.getiName()).collect(Collectors.toList());
		System.out.println(itemNames);

		Item costlierItem = itemList.stream().reduce((item1,item2)->(item1.getPrice()>item2.getPrice()?item1:item2)).orElse(null);
		System.out.println(costlierItem);
	}
}
