package com.prowings.Java2025.Array;

import java.util.Arrays;

public class ArrayOfCustomDT {
	public static void main(String[] args) {
		
		Student s1 = new Student(10,"Ram");
		Student s2 = new Student(20,"Sham");
		Student s3 = new Student(30,"Rahul");
		Student s4 = new Student(40,"Jay");
		
		Student[] groupOfStudent = {s1,s2,s3};
		
		System.out.println(Arrays.toString(groupOfStudent));
		
		Object[] array = groupOfStudent;
		
		System.out.println(Arrays.toString(array));
	}

}
