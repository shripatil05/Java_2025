package com.prowings.Java2025.string.interviewprogram;

public class PalindromeString2 {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		String input ="Radar";
		if(isPalindrome(input))
			System.out.println("Given string is palindrome");
		else
			System.out.println("GIven string is not palindrome");
		
		System.out.println("Main method ended!!");
	}
	
	public static boolean isPalindrome(String input) {
		return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString()) ? true : false;
	}
}
