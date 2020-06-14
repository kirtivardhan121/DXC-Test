package com.dxc.cd.ui;

import com.dxc.cd.service.Swapper;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Integer n1 = 90;
		Integer n2 = 97;
		
		String c1 = "Hello";
		String c2 = "Hey";
		
		Swapper<Integer> s1 = new Swapper<>();
		s1.doSwap(n1, n2);
		
		Swapper<String> s2 = new Swapper<>();
		s2.doSwap(c1, c2);
		
		
	}
}
