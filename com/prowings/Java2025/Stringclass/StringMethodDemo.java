package com.prowings.Java2025.Stringclass;

public class StringMethodDemo {
	public static void main(String[] args) {
		
		String s1 = "helloworld";
		
		int numberOfChar = s1.length();
		System.out.println(numberOfChar);
		
		char c = s1.charAt(4);
		System.out.println("charcter at index 4 is :"+c);
		
		String s2 = " ";
		System.out.println("isEmpty :"+s2.isEmpty());
		System.out.println("isBlank :"+s2.isBlank());
		
		String s3 ="helloworld";
		System.out.println("original s3 :"+s3);
		
		String s4 = s3.substring(5);
		System.out.println("substring is:"+s4);
		
	}

}
