package com.dxc.oopd.ui;

import com.dxc.oopd.model.EducationalLoan;
import com.dxc.oopd.model.HousingLoan;
import com.dxc.oopd.model.Loan;

public class AbstractClassWithAbstractFunctionDemo {

	public static void main(String[] args) {
		
		Loan l1 = new HousingLoan(10000, 1, 12, 4);
		
		Loan l2 = new EducationalLoan(10000, 1, 12, 5000);

		System.out.println(l1.getPayableAmount());
		System.out.println(l2.getPayableAmount());
	
	}//end of main

}//end of AbstractClassWithAbstractFunctionDemo
