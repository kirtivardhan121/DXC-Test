package com.dxc.assignments;

import java.util.Scanner;

public class StringApplication1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		switch(10-ch.length)
		{
		case 1: System.out.println(s+"*");
		break;
		case 2:System.out.println("*"+s+"*");
		break;
		case 3:System.out.println("*"+s+"**");
		break;
		case 4:System.out.println("**"+s+"**");
		break;
		case 5:System.out.println("**"+s+"***");
		break;
		case 6:System.out.println("***"+s+"***");
		break;
		case 7:System.out.println("***"+s+"****");
		break;
		case 8:System.out.println("****"+s+"****");
		break;
		case 9:System.out.println("****"+s+"*****");
		break;
		default:System.out.println(s);
		}
		
		sc.close();
	}
}
