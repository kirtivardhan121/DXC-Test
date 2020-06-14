package com.dxc.js;

import java.util.Scanner;

/*
 * Accept user desired number and 
 * display the below
 * sum of elements 
 * avg of elements
 * min of elements
 * max of all those
 */
public class NumberStats {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many elements? ");
        int count = scanner.nextInt();
        
        int[] nums = new int[count];
        System.out.println("Enter "+count+" integrs: ");
        for(int i=0;i<count;i++) {
            nums[i] = scanner.nextInt();
        }
        
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int num:nums) {
            sum+=num;
            min = min>num?num:min;
            max = max<num?num:max;
        }
        
        double avg = ((double)sum)/nums.length; 
        
        System.out.println("Sum: " +sum);
        System.out.println("Avg: " +avg);
        System.out.println("Min: " +min);
        System.out.println("Max: " +max);
        
        scanner.close(); 
		}
	}


