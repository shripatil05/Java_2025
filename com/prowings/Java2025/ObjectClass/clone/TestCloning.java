package com.prowings.Java2025.ObjectClass.clone;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main method started!!");
		Employee e1 = new Employee(101,"John","123 main street",55000);
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println("Employee 1"+e1);
		System.out.println("Employee 2"+e2);
		
		System.out.println("--------------- Appriasal Done ---------------");
		
		e1.setEmpName("Ram");
		e1.setSalary(e1.getSalary() - 2000);
		e2.setSalary(e2.getSalary() + 7000);
		
		System.out.println("after appriasal Employee 1 :"+e1);
		System.out.println("after appriasal Employee 2 :"+e2);
		
		System.out.println("Main method ended!!");

	}

}
