package com.prowings.Java2025.stringbufferclass;

public class StringBufferReverse2 {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		reverseString("abcd");
		
		System.out.println("Main method ended!!");
	}
	
	public static String reverseString(String input) {
		System.out.println("Original string :"+input);
		
		char[] chars = input.toCharArray();
		
		char[] reversedArray = new char[chars.length];
		int index =0;
		
		for(int i = chars.length -1;i<chars.length;i--) {
			System.out.println(chars[i]);
			reversedArray[index] =chars[i];
			index++;
			if(i==0)
				break;
		}
		
		String reversedStr = new String(reversedArray);
		System.out.println(reversedStr);
		return reversedStr;
		
	}

}
