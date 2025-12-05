package com.prowings.Java2025.Exception;

public class SimpleExceptionScenario {
	public static void main(String[] args) {
		divide();
	}
	
	public static void divide() {
		int result = 0;
		
		try {
		int[] a = {10,20,30,40};
		result = a[1]/0;
	    }
		
		catch(IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException occurred");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occurred");
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		
		System.out.println("Division is :"+result);
		
	}	

}
