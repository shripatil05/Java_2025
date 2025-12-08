package com.prowings.Java2025.Array;

import java.util.Arrays;

public class CloningArray {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		int[] clonedArr = arr.clone();
		
		arr[0] = 100;
		
		System.out.println("original array :"+Arrays.toString(arr));
		System.out.println("Cloned array :"+Arrays.toString(clonedArr));
	}

}
