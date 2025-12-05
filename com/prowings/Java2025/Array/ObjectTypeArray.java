package com.prowings.Java2025.Array;

public class ObjectTypeArray {
	public static void main(String[] args) {
		
		Object[] elements = new Object[5];
		
		Student s1 = new Student(10,"Ram");
		Student s2 = new Student(20,"Sham");
		String str1 = "Hello";
		StringBuffer str2 = new StringBuffer("Hii..");
		int a = 1000;
		
		elements[0] = a;
		elements[1] = s1;
		elements[2] = str1;
		elements[3] = s2;
		elements[4] = str2;
		
		for(Object o : elements) {
			//System.out.println(o);
			if(o instanceof Student) {
				System.out.println(o);
			}
		}
	}

}
