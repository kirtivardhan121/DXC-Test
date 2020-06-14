package com.dxc.cd.service;

import java.util.Comparator;

import com.dxc.cd.model.Item;

public class ItemPriceComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		Double a = o1.getPrice();
		Double b = o2.getPrice();
		return a.compareTo(b);
	}

}
