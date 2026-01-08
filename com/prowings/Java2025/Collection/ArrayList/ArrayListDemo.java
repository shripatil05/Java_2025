package com.prowings.Java2025.Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("Hii");
		al.add(456);
		al.add("Hello");
		al.add(789);
		
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("pqr");
		al2.add("abc");
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		Integer i = 123;
		al.remove(i);
		System.out.println(al);
		
//		al.removeAll(al2);
//		System.out.println(al);
		
		
		System.out.println(al.contains(789));
		System.out.println(al.containsAll(al2));
		
		al.retainAll(al2);
		System.out.println(al);
		
		
		System.out.println(al.size());
		
		System.out.println((al.equals(al2))); //content equality
		System.out.println((al == al2)); //referance equality
		
		System.out.println(al.hashCode());
		System.out.println(al2.hashCode());
		
		al.clear();
		System.out.println(al);
		
		System.out.println(al.isEmpty());
				
		
	}

}
