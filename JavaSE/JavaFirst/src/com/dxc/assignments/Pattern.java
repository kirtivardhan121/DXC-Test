package com.dxc.assignments;

import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		char b[] = s.toCharArray();

		for(int i=0;i<=b.length-1;i++) {

			for(int j=0;j<=i;j++) {
				
					System.out.print(b[j]);	
			}
			System.out.println();
		}
		sc.close();
	}
}
