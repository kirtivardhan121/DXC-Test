package com.dxc.ld.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComputations {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.format(dtf));
		
		LocalDate independaceDay = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(independaceDay.format(dtf));
		
		System.out.println(independaceDay.plusYears(100));
		System.out.println(independaceDay.minusYears(100));
		
		Period p = Period.between(independaceDay, today);
		System.out.println(p);
		System.out.println(p.getYears() + " Year Approxx");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your DOB (dd-MM-yyyy)");
		String donStr  = sc.next();
		
		LocalDate dob = LocalDate.parse(donStr, dtf);
		System.out.println("You are born in "+ dob.format(dtf));
		
		Period age = Period.between(dob, today);
		System.out.println("Age in Years "+ age.getYears());
		sc.close();
	}
}
