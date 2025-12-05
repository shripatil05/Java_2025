package com.prowings.Java2025.Exception;

public class SimpleExceptionScenario2 {
	public static void main(String[] args) {
		
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		
		int res = 10;
		
		try {
			System.out.println("inside try block");
			System.exit(0);
			res =  10/0;
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointerException occurred");
		}
		
		finally {
			System.out.println("inside finally block");
		}
		
		System.out.println("Hello 4");
		System.out.println("Hello 5");
	}

}
