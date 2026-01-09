package com.prowings.Java2025.Collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo2 {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("aaa", 10);
		ht.put("bbb", 20);
		ht.put("ccc", 30);
		ht.put("ddd", 40);
		
		System.out.println(ht);
		
//		Set<String> keySet = ht.keySet();
//		
//		Iterator<String> itr = keySet.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			ht.remove("aaa");
//		}
		
		Enumeration<String> enumeration = ht.keys();
		Enumeration<Integer> enumeration1 = ht.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			ht.remove("ccc");
		}
	}

}
