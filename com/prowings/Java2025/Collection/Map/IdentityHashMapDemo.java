package com.prowings.Java2025.Collection.Map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10,"Ram");
		Employee emp2 = new Employee(10,"Ram");
		Employee emp3 = new Employee(20,"Sham");
		Employee emp4 = emp3;
		
		System.out.println("Reference equality :"+(emp1 == emp2));
		
		System.out.println("Contant equality :"+(emp1.equals(emp2)));
		
		IdentityHashMap<Employee, String> hm = new IdentityHashMap<>();
		
		hm.put(emp1, "aaaa");
		hm.put(emp2, "bbbb");
		hm.put(emp3, "cccc");
		hm.put(emp4, "dddd");
		
		System.out.println(hm);
	}
	
	

}
