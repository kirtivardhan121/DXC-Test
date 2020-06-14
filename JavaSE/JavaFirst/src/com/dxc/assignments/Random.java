package com.dxc.assignments;

public class Random {
public static void main(String[] args) {
	String Names = new String("bob,alice,smith");
	Names = Names.replaceAll(",", ":");
	System.out.println(Names);
}
}
