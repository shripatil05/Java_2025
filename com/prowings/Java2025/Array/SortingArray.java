package com.prowings.Java2025.Array;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		
		int[] num1 = {2,1,4,6,5,3};
		
		System.out.println(Arrays.toString(num1));
		
		int[] sortedArray = sort(num1);
		
		System.out.println("After sorting : "+Arrays.toString(sortedArray));
		
	}

	public static int[] sort(int[] arr) {
//		Arrays.sort(num1);
		System.out.println("----sorting started-----");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		
        System.out.println("----sorting ended-----");
		return arr;
	}


}
