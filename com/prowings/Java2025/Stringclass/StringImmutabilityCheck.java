package com.prowings.Java2025.Stringclass;

public class StringImmutabilityCheck {
	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="hello";
		String s3 ="helloworld";
		
		System.out.println("Referance equality of s1 == s2 :"+(s1 == s2));
		System.out.println("before s1 :"+s1);
		System.out.println("before s2 :"+s2);
		
		s1 =s1.concat("world");
		System.out.println("After s1 :"+s1);
		System.out.println("After s2 :"+s2);
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println("Referance equality of s1 == s3 :"+(s1 == s3));
		
		
		
		
	}

}
