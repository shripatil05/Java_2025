package com.prowings.Java2025.ObjectClass.clone.shallow;

public class TestShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad1 = new Address(1234,"Pune","India");
		Employee e1 = new Employee(10,"Sham",ad1);
		
		Employee e2 = (Employee) e1.clone();
		System.out.println("Employee e1:"+e1);
		System.out.println("Employee e2:"+e2);
		
		System.out.println("Hashcode of e1 : "+e1.hashCode());
		System.out.println("Hashcode of e2 : "+e2.hashCode());
		
		System.out.println("--------------- After update-----------------");
		
		e2.setName("Ram");
		System.out.println("Employee e2 :"+e2);
		System.out.println("Employee e1 :"+e1);
		
		e2.getAddress().setCity("Kolhapur");
		System.out.println("After update e2 :"+e2);
		System.out.println("After update e1 :"+e1);
	}

}
