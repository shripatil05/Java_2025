package com.prowings.Java2025.Array;

import java.util.Arrays;

public class DeleteElementInArray {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7};
		int position = 2;
		
		int[] result = deleteAt(numbers, position);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] deleteAt(int[] numbers, int position) {
		
		if((position < 0) || (position > numbers.length - 1))
			throw new RuntimeException("Invalid position");
		
		for(int i = position;i<numbers.length - 1;i++) {
			numbers[i] = numbers[i + 1];
		}
		
		int[] newnumber = new int[numbers.length - 1];
		for(int i = 0;i<newnumber.length;i++)
			newnumber[i] = numbers[i];
		
		
		return newnumber;
	}

}
