package com.prowings.Java2025.ObjectClass.clone;

public class TestStudentCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main method Stated!!");
		
		Student s1 = new Student(20,"Ram",20,60);
		
		Student s2 = (Student) s1.clone();
		
		s2.setName("Sham");
//		System.out.println("std 1 markss are : ");
		s1.setMarks(s1.getMarks());
		s2.setMarks(95);
		
		System.out.println("Student 1 :"+s1);
		System.out.println("Student 2 :"+s2);
		
		System.out.println("Main method Ended!!");
	}

}
