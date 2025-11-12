package com.prowings.Java2025.ObjectClass.clone.deep;

public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		PermanentAddress pa1 = new PermanentAddress(12345,"M G Road","Pune");
		Employee e1 = new Employee(10,"Ram",pa1);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Employee e1 :"+e1);
		System.out.println("Employee e2 :"+e2);
		
		System.out.println("--------------- updated content----------------");
		
		e1.setName("Sham");
		e2.getAddress().setCity("Kolhapur");
		
		System.out.println("After update e1 :"+e1);
		System.out.println("After update e2 :"+e2);
	}

}
