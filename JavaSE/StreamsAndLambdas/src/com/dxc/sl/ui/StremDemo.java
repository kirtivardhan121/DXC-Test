package com.dxc.sl.ui;

import java.util.Arrays;

public class StremDemo {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("------------forEach()--------------");
		Arrays.stream(nums).forEach(System.out::println);
		
		System.out.println("------------filter()--------------");
		Arrays.stream(nums).filter((n) -> (n%2==0)).forEach(System.out::println);
		
		System.out.println("------------map()--------------");
		Arrays.stream(nums).map((n) -> (n*n)).forEach(System.out::println);
		
		System.out.println("------------map() & filter()--------------");
		Arrays.stream(nums).filter((n) -> (n%2==0)).map((n) -> (n*n)).forEach(System.out::println);
		
		System.out.println("------------reduce()--------------");
		int ans= Arrays.stream(nums).reduce((v1,v2) ->(v1+v2)).getAsInt();
		System.out.println(ans);
		
		System.out.println("----------------------------------");
	}
}
