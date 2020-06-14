package com.dxc.js;

import java.util.Scanner;

/*
 * Accept three integers and 
 * print the one with the greatest value
 */
public class FindGreater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second integer");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third integer");
		int n3 = sc.nextInt();
		
		 if(n1 > n2 && n1 >3) {
			 System.out.println("N1 is greatest");
		 } else if (n2 > n3) {
			 System.out.println("N2 is greatest");
		 } else {
			 System.out.println("N3 is greatest");
			 sc.close();
		 }
	}

}
