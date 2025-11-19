package com.prowings.Java2025.stringbufferclass;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer std = new StringBuffer("hello");
		
		System.out.println("Length of std :"+std.length());
		
		std.trimToSize();
		System.out.println("capacity of std :"+std.capacity());
		
		System.out.println("Original std :"+std);
		
		std.append("world");
		
		System.out.println("after append std :"+std);
	}
	
}
