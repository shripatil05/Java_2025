package com.prowings.Java2025.Array;

import java.util.Arrays;

public class SortArrayDecendingOrder {
	public static void main(String[] args) {
		
		int[] nums = {21,22,20,12,11};
		
		Arrays.sort(nums);
		
		System.out.println("Ascending order is :"+Arrays.toString(nums));
		
		int j = 0;
		int[] result = new int[nums.length];
		
		for(int i = nums.length-1;i>=0;i--) {
			result[j] = nums[i];
			j++;
		}
		System.out.println("Descending order is :"+Arrays.toString(result));
	}

}
