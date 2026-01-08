package com.prowings.Java2025.Array;

import java.util.Arrays;

public class ArrayBubbleSort {
	public static void main(String[] args) {

		int[] nums = { 12, 11, 14, 31, 13, 10 };

		sortArrayUsingBubbleSort(nums);

		// Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));
	}

	public static void sortArrayUsingBubbleSort(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					
				}
			}
		}

	}

}
