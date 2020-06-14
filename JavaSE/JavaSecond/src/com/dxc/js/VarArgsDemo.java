package com.dxc.js;

public class VarArgsDemo {

	public static void main(String[] args) {
		
		System.out.println(sum());
		System.out.println(sum(10+20));
		System.out.println(sum(20+30+40));
		
	}
	
	private static int sum(int ...nums) {
		int s=0;
		for(int n:nums) {
			s+=n;
		}
		return s;
	}
	

}
