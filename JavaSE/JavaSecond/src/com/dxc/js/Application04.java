package com.dxc.js;

import java.util.Scanner;

public class Application04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your age ");
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}
}
