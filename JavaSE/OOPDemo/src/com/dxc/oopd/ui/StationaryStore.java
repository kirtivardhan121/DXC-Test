package com.dxc.oopd.ui;

import com.dxc.oopd.model.ConsumableItems;
import com.dxc.oopd.model.Item;
import com.dxc.oopd.model.ServicableItem;

public class StationaryStore {

	public static void main(String[] args) {
		
		Item si = new Item(111, "pen", 5, 10);
		ConsumableItems ci = new ConsumableItems(101, "ink", 50, 60, 20);
		ServicableItem seri = new ServicableItem(108, "Printer", 2500, 3000, 1000, 2);
		
		System.out.println(si.getItemCode() +"\t"+ si.getItemName() +"\t"+ si.getCostPrice() +"\t"+ si.getSellingPrice());
		System.out.println(ci.getItemCode() +"\t"+ ci.getItemName() +"\t"+ ci.getCostPrice() +"\t"+ ci.getSellingPrice()+"\t"+ ci.getValidity());
		System.out.println(seri.getItemCode() +"\t"+ seri.getItemName() +"\t"+ seri.getCostPrice() +"\t"+ seri.getSellingPrice()+"\t"+seri.getServiceCost()+"\t"+seri.getWarranty());
	}
}
