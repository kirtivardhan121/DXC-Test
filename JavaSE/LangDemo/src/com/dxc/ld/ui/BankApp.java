package com.dxc.ld.ui;

import com.dxc.ld.exception.BankException;
import com.dxc.ld.model.BankAccount;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("012005", 5000);
		System.out.println("current balance = " + acc.getCurrentBalance());
		
		try {
			acc.deposit(-5600);
		} catch (BankException e) {
			
			System.err.println(e.getMessage());
		}
		System.out.println("current balance = " + acc.getCurrentBalance());
		
		try {
			acc.deposit(5600);
		} catch (BankException e) {
			
			System.err.println(e.getMessage());
		}
		System.out.println("current balance = " + acc.getCurrentBalance());
		
		
		try {
			acc.withdraw(87000);
		} catch (BankException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(m1());
	}
	
	public static int m1() {
		
		try {
			System.out.println("From try block");
			return 1;
		}catch(Exception e) {
			System.out.println("From catch block");
		} finally {
			System.out.println("from finally");
			return 3;
		}
		
}
}

