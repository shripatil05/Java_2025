package com.prowings.Java2025.Stringclass;

public class StringMethodScenario1 {
	public static void main(String[] args) {
		String s1 ="helloworld";
		
		String s2 =s1.substring(5,5);
		System.out.println(s2);
		System.out.println(s2.isEmpty());
		System.out.println(s2.isBlank());
		
		System.out.println("----------------------------");
		
		String str1 ="hello";
		String str2 ="hello";
		
		System.out.println("referance equality :"+(str1 == str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("equals :"+(str1.equals(str2)));
		
		System.out.println("-------------------------------");
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println("referance equality :"+(str3 == str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println("equals :"+(str3.equals(str4)));
		
		System.out.println("--------------------------------");
		
		String st1 ="hello";
		String st2 ="HELLO";
		
		System.out.println(st1 == st2);
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st2));
		
		System.out.println(st1.equalsIgnoreCase(st2));
		
		System.out.println(st2);
		System.out.println(st2.toLowerCase());
		
		System.out.println(st1.toUpperCase());

	}

}
