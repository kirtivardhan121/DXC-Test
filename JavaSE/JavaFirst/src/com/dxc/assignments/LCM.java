package com.dxc.assignments;

public class LCM {

	public static void main(String[] args) {
		
		int[] array = { 2, 7, 3, 9, 4 }; 
        System.out.println(lcm(array)); 

	}

	public static long lcm(int[] array) 
    { 
        long a = 1; 
        int divisor = 2; 
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
              
            for (int i = 0; i < array.length; i++) { 
  
  
                if (array[i] == 0) { 
                    return 0; 
                } 
                else if (array[i] < 0) { 
                    array[i] = array[i] * (-1); 
                } 
                if (array[i] == 1) { 
                    counter++; 
                } 
   
                if (array[i] % divisor == 0) { 
                    divisible = true; 
                    array[i] = array[i] / divisor; 
                } 
            } 
   
            if (divisible) { 
                a = a * divisor; 
            } 
            else { 
                divisor++; 
            } 
   
            if (counter == array.length) { 
                return a; 
            } 
        } 
    } 
}
