package com.prowings.Java2025.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorithmMethodsDemo2 {
	public static void main(String[] args) {
		
		Student std1 = new Student(10,"Ram",98);
		Student std2 = new Student(20,"Sham",96);
		Student std3 = new Student(30,"Rohan",90);
		Student std4 = new Student(40,"Karan",100);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		studentList.add(std4);
		
		System.out.println("Before Sorting :"+studentList);
		
		Collections.sort(studentList, new StudentMarksComparator());
		
		System.out.println(studentList);
	}

}
