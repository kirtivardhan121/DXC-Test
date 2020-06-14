package com.dxc.cd.service;

public class Swapper<T> {

	public void doSwap(T a, T b) {
		System.out.println("Before Swapping " +a+ "\t" +b);
		
		T temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping " +a+ "\t" +b);
	}
}
