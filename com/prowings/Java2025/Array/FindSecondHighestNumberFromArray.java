package com.prowings.Java2025.Array;

import java.util.Arrays;

public class FindSecondHighestNumberFromArray {
	public static void main(String[] args) {
		
		int[] nums = {22,21,23,20,11,12};
		
		int res = findSecondHighest(nums);
		
		System.out.println("Second highest is :"+res);
		
	}

	public static int findSecondHighest(int[] nums) {
		
		if(nums.length < 2) {
			throw new RuntimeException("Invalid array size");
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		return nums[nums.length - 2];
	}



}
