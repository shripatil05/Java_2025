package com.prowings.Java2025.Array;

public class ArraySearching {
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60};
		int key = 10;
		
		//String result = findElementUsingLinearSearch(key,numbers) ? "Found" : "Not Found";
		String result = findElementUsingBinarySearch(key,numbers) ? "Found" : "Not Found";
		
		System.out.println(result);
	}
	
	public static boolean findElementUsingLinearSearch(int key, int[] numbers) {
		
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i] == key)
				return true;
		}
		return false;
	}
	
	public static boolean findElementUsingBinarySearch(int key, int[] numbers) {
		
		boolean result = false;
		int low = 0;
		int high = numbers.length;
		
		while(low<=high) {
			int mid = (low + high)/2;
			
			if(numbers[mid] == key) {
				System.out.println("Element found at index : "+mid);
				result = true;
				break;
			}
			else if(key > numbers[mid]) {
				low = mid + 1;
			}
			else
				high = mid - 1;
		}
		return result;
	}

}
