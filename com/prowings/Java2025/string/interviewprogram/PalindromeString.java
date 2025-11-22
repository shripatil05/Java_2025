package com.prowings.Java2025.string.interviewprogram;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("Mian method started!!");
		
		String input = "Radar";
		if(isPalindrome(input))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
		System.out.println("Mian method ended!!");
	}
	
	public static boolean isPalindrome(String input) {
		System.out.println("Resevied string :"+input);
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String reversedStr = sb.toString();
		System.out.println("Reversed string :"+reversedStr);
		if(input.equalsIgnoreCase(reversedStr))
			return true;
		else
			return false;
		
	}

}
