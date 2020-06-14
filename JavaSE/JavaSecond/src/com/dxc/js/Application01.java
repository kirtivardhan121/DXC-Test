package com.dxc.js;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your name");
		String un = sc.nextLine();
		
		System.out.println("Your age");
		int age = sc.nextInt();
		
		System.out.println("Hello " + un + " you are just " + age + " Year old");
	}

}
