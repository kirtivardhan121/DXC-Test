package com.dxc.js;

import java.util.Scanner;

public class Application03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of r ");
		int r = sc.nextInt();
		
		double circumference = 2*3.14*r;
		System.out.println("Circumference is " + circumference);
	}
}
