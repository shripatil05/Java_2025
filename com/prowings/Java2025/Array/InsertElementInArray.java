package com.prowings.Java2025.Array;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class InsertElementInArray {
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70};
		int elementToInsert = 101;
		int position = 5;
		
		int[] result = insertAt(elementToInsert,position,numbers);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] insertAt(int elementToInsert, int position, int[] numbers) {
		
		if((position < 0) || (position > numbers.length - 1)) {
			throw new RuntimeException("Invalid position");
		}
		
		int[] newNumbers = new int[numbers.length + 1];
		
		for(int i =0; i<numbers.length;i++)
			newNumbers[i] = numbers[i];
		System.out.println(Arrays.toString(newNumbers));
		
		for(int i=newNumbers.length - 2; i>=position; i--) {
			newNumbers[i + 1] = newNumbers[i];
		}
		newNumbers[position] = elementToInsert; 
		
		return newNumbers;
	}

}
