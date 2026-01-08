package com.prowings.Java2025.Collection.Map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("aaa", 10);
		ht.put("bbb", 20);
		ht.put("ccc", 30);
		ht.put("ddd", 40);
		
		System.out.println(ht);
		
		Car c1 = new Car(10,"Audi",1000000.0);
		Car c2 = new Car(20,"BMW",200000.0);
		Car c3 = new Car(10,"Audi",1000000.0);
		Car c4 = c1;
		
		Hashtable<Car, Integer> ht2 = new Hashtable<>();
		
		ht2.put(c1, 1111);
		ht2.put(c2, 2222);
		ht2.put(c3, 3333);
		ht2.put(c4, 4444);
		
		System.out.println(ht2);
	}

}
