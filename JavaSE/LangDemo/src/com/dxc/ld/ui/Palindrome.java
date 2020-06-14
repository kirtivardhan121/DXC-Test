package com.dxc.ld.ui;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");  
		String s = sc.nextLine();   

		/*StringBuilder sb = new StringBuilder();

		for ( int i = s.length() - 1; i >= 0; i-- )  {
			sb.append(s.charAt(i));  
		}*/

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String palindrome = sb.toString();

		if (s.equals(palindrome)) { 
			System.out.println("Entered string is a palindrome.");
			System.out.println(palindrome);
		}
		else  {
			System.out.println("Entered string isn't a palindrome.");  
		}

	}
}
