package com.dxc.cd.ui;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Zebra");
		set1.add("Donkey");
		set1.add("Aligator");
		
		for(String s : set1) {
			System.out.println(s);
		}
		System.out.println("----------------");
		
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Zebra");
		set2.add("Donkey");
		set2.add("Aligator");
		
		
		for(String s : set2) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
		
		Set<String> set3 = new TreeSet<String>();
		set3.add("Zebra");
		set3.add("Donkey");
		set3.add("Aligator");
		
		for(String s : set3) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
	}
}
