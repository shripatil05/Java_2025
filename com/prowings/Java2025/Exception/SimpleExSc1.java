package com.prowings.Java2025.Exception;

public class SimpleExSc1 {
	public static void main(String[] args) {
		String s = "aaa";
		
		try {
			System.out.println("inside try block");
			s.charAt(10);
			int a = 10/0;
			System.out.println("Hello");
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointerException occurred");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException occurred");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
		}
		
		finally {
			System.out.println("Inside finally block");
		}
	}

}
