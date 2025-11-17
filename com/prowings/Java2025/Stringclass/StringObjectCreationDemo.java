package com.prowings.Java2025.Stringclass;

public class StringObjectCreationDemo {
	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="hello";
		
		System.out.println("1---- referance equality :"+(s1 == s2));
		
		s1 =s1.concat("world");
		
		System.out.println("after concatination s1 :"+s1);
		System.out.println("2---- reference equality :"+(s1 == s2));
		
		String s3 = new String("helloworld");
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println("referance equality if s1 and s3 :"+(s1 == s3));
	}

}
