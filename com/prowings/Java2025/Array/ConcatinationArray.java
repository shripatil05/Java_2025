package com.prowings.Java2025.Array;

import java.util.Arrays;

public class ConcatinationArray {
	public static void main(String[] args) {
		
		int[] array1 = {12,23,34,45,56,67,78};
		int[] array2 = {87,76,65,54,43,32,21};
		
		int[] result = concatArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] concatArray(int[] array1, int[] array2) {
		
		int[] numbers = new int[array1.length + array2.length];
		int count = 0;
		for(int i=0;i<array1.length;i++) {
			numbers[i] = array1[i];
			count++;
		}
		
		for(int i=0;i<array2.length;i++) {
			numbers[count] = array2[i];
			count++;
		}
		return numbers;
	}

}
