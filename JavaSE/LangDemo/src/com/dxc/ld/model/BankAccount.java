package com.dxc.ld.model;

import com.dxc.ld.exception.BankException;

public class BankAccount {

	public static final double MIN_BAL=500;
	
	private String accNum;
	private double currentBalance;
	
	public BankAccount() {
		//left unimplemented
	}

	public BankAccount(String accNum, double currentBalance) {
		super();
		this.accNum = accNum;
		this.currentBalance = currentBalance;
	}

	public void deposit(double amount) throws BankException {
		
		if(amount <= 0) {
			throw new BankException("Deposit amount should always greater than 0");
		}
		currentBalance += amount;
	}
	
	public void withdraw(double amount) throws BankException {
		
		if((currentBalance-amount)>MIN_BAL) {
			throw new BankException("Insufficient Balance");
		}
		currentBalance -= amount;
	}
	
	
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
}
