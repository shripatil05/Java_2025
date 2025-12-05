package com.prowings.Java2025.Array;

public class MultidimensionalArray2 {
	
	public static void main(String[] args) {
		
		int[][] nums = {
				{11,12,13},
				{21,22,23,24},
				{31,32,33},
				{41,42,43,44,45,46}
		};
		
		for(int i =0; i<nums.length;i++) {
			for(int j = 0;j<nums[i].length;j++) {
				System.out.print(" "+nums[i][j]);
		}
			
		System.out.println();
	}
	}

}
