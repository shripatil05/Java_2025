package com.prowings.Java2025.immutableclass;

public class TestImmutability {
	public static void main(String[] args) {
		Address ad1 = new Address(1234,"Pune");
		Student std = new Student(10,"Ram",ad1);
		
		System.out.println("Original std Object :"+std);
		
		ad1.setCity("Mumbai");
		
		std.getAddress().setCity("Dubai");
		
		System.out.println("After modifiy std :"+std);
	}

}
