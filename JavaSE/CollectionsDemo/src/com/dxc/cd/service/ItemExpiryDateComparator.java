package com.dxc.cd.service;

import java.util.Comparator;

import com.dxc.cd.model.Item;

public class ItemExpiryDateComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.getExpiryDate().compareTo(o2.getExpiryDate());
	}

}
