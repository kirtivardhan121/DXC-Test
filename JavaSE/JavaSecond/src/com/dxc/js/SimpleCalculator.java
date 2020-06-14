package com.dxc.js;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean shallContinue = true;

		while(shallContinue) {

			System.out.println("Enter Operand1: ");
			while(!sc.hasNextInt()) {
				System.out.println("Expecting an intiger");
				sc.next();
			}
			int oper1 = sc.nextInt();

			System.out.println("Enter Operand2: ");
			int oper2 = sc.nextInt();
			System.out.println("Operation(sum/diff/prd/qut/rem: ");
			String operation = sc.next();

			switch(operation) {
			case "Sum": System.out.println("Sum is " + (oper1 + oper2));
			break;
			case "diff": System.out.println("diff is " + (oper1 - oper2));
			break;
			case "prd": System.out.println("Product is " + (oper1 * oper2));
			break;

			case "qut": 
				if(oper2!=0) {
					System.out.println("qut is " + (oper1 / oper2));
				} else {
					System.out.println("Zero is not acceptable");
				}
				break;
			case "rem": System.out.println("rem is " + (oper1 % oper2));
			break;
			default : System.out.println("operation not understood");
			break;
			}
			System.out.print(" Shall Continue?(true/false) ");
			shallContinue = sc.nextBoolean();
		}

		System.out.println("Application Terminated");
		sc.close();
	}

}
