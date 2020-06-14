package com.dxc.ld.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Eneter Your Mobile NUmber:");
		String mno = sc.next();
		
		if(mno.matches("[1-9][0-9]{9}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid mobile number");
		}
		
		Pattern mobileNumberPattern = Pattern.compile("[1-9][0-9]{9}");
		Matcher matcher = mobileNumberPattern.matcher(mno);
		if(matcher.matches()) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("invalid mobile number");
		}
		
		sc.close();
	}
}
