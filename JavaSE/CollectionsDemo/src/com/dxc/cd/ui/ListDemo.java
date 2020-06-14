package com.dxc.cd.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list1 = new Vector<>();
		list1.add("Zebra");
		list1.add("Donkey");
		list1.add("Aligator");
		
		for(String s : list1) {
			System.out.println(s);
		}
		System.out.println("----------------");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Zebra");
		list2.add("Donkey");
		list2.add("Aligator");
		
		
		for(String s : list2) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
		
		List<String> list3 = new LinkedList<String>();
		list3.add("Zebra");
		list3.add("Donkey");
		list3.add("Aligator");
		
		for(String s : list3) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
	}
}
