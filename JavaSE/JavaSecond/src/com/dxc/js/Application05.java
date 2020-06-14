package com.dxc.js;

import java.util.Scanner;

public class Application05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length");
		int len = sc.nextInt();
		
		System.out.println("Enter breadth");
		int bre = sc.nextInt();
		
		System.out.println("Enter height");
		int height = sc.nextInt();
		
		int perimeter = len*bre*height;
		System.out.println("Perimeter of square is " + perimeter);
	}
}
