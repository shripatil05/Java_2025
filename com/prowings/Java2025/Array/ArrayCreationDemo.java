package com.prowings.Java2025.Array;

public class ArrayCreationDemo {
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers.getClass().getName());
		
		for(int i = 0;i<5;i++) {
			System.out.println(numbers[i]);
		}
	}

}
