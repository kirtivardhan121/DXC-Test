package com.dxc.assignments;

import java.util.Scanner;

public class Covid {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the cost of COVID19 Kit:");
		int cost=scanner.nextInt();
		
		System.out.println("Enter the Number of Kit: ");
		int num=scanner.nextInt();
		
		if(num<2500) {
			System.out.println("Total cost= "+(cost*num));
		}
		else if(num>2500&&num<50000) {
			int initPrice=(cost*num);
			int disPrice=initPrice-((initPrice)*1/20);
			System.out.println("Total cost: "+disPrice);
		}
		else if(num>50000&&num<75000) {
			int initPrice=(cost*num);
			int disPrice=initPrice-((initPrice)*1/5);
			System.out.println("Total cost: "+disPrice);
		}
		else if(num>75000) {
			int initPrice=(cost*num);
			int disPrice=initPrice-((initPrice)*3/10);
			System.out.println("Total cost: "+disPrice);
		}

	}

}
