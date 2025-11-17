package com.prowings.Java2025.Stringclass;

public class StringMethodDemo3 {
	public static void main(String[] args) {
		String s1 ="helloworld";
		
		//startsWith
		if(s1.startsWith("hello"))
			System.out.println("VALID!!");
		else
			System.out.println("INVALID");
		
		//endsWith
		if(s1.endsWith("world"))
			System.out.println("VALID content");
		else {
			System.out.println("INVALID content");
		}
	}

}
