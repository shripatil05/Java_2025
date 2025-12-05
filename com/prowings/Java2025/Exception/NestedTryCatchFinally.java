package com.prowings.Java2025.Exception;

public class NestedTryCatchFinally {
	public static void main(String[] args) {
		
		int res = 0;
		try {
			System.out.println("inside outer try block");
//			res = 10/0;
			
			try {
				System.out.println("inside inner try block");
				res = 10/0;
			}
			catch(NullPointerException e) {
				System.out.println("NullPointerException occurred");
			}
			finally {
				System.out.println("inside inner finally block");
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occurred");
		}
		
		finally {
			System.out.println("inside inner finally block");
		}
	}

}
