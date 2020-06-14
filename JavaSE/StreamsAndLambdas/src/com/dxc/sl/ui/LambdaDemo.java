package com.dxc.sl.ui;

import com.dxc.sl.service.Combiner;
import com.dxc.sl.service.IntegerCombiner;

public class LambdaDemo {

	public static void main(String[] args) {

		Combiner<Integer> c1 = new IntegerCombiner();
		System.out.println(c1.combine(12, 35));

		Combiner<String> c2 = new Combiner<String>() {

			@Override
			public String combine(String ele1, String ele2) {

				return ele1+ele2;
			}
		};
		System.out.println(c2.combine("Hello", "World"));

		//create lambda expression
		Combiner<Double> c3 = (ele1, ele2) -> ele1+ele2;
		System.out.println(c3.combine(32.1 , 45.6));

		Combiner<int[]> c4 = (arr1, arr2) -> {
			int arr3[] = new int[arr1.length+arr2.length];

			for(int i=0; i<arr1.length;i++) {
				arr3[i] = arr1[i];
			}

			for(int j=0; j<arr2.length; j++) {
				arr3[j] = arr2[j];
			}
			return arr3;
		};

		int[] arr = c4.combine(new int[] {10,20,30},new int[] {40,50,60,70});
		for(int ele:arr) {
			System.out.println(ele);
		}
	}
}
