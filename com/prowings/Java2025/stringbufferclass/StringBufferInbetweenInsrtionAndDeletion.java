package com.prowings.Java2025.stringbufferclass;

public class StringBufferInbetweenInsrtionAndDeletion {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("helloWorld");
		
		System.out.println(sb1.capacity());
		
		System.out.println("Original sb1 :"+sb1);
		sb1.insert(5,'-');
		System.out.println(sb1.capacity());
		
		System.out.println("After insert sb1 :"+sb1);
		
		sb1.delete(0,5);
		System.out.println(sb1);
	}

}
