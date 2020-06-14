package com.dxc.js;

import java.util.Scanner;

public class GreetFriends {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many friends do you have");
		int count = sc.nextInt();
		
		String[] friends = new String[count];
		
		System.out.println("Their name please...");
		for(int i=0; i<count; i++) {
			friends[i] = sc.next();
		}
		for(int i=0; i<count; i++) {
			
			if(i%2 == 0) {
			System.out.println("Hey " + friends[i]);
			}else {
				System.out.println("Hello " + friends[i]);
			}
			
		}
		sc.close();
	}
}
