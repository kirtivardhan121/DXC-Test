package com.dxc.cd.service;

import java.util.Comparator;

import com.dxc.cd.model.Item;

public class ItemCategoryComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.getCategory().compareTo(o2.getCategory());
	}

}
