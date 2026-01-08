package com.prowings.Java2025.Collection.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		
		WeakHashMap<StringBuffer, Integer> hm = new WeakHashMap<>(); 
		
		StringBuffer k1 = new StringBuffer("AAA");
		StringBuffer k2 = new StringBuffer("BBB");
		StringBuffer k3 = new StringBuffer("CCC");
		StringBuffer k4 = new StringBuffer("DDD");
		
		hm.put(k1, 123);
		hm.put(k2, 123);
		hm.put(k3, 123);
		hm.put(k4, 123);
		
		System.out.println("before gc :"+hm);
		
		k2 = null;
		System.gc();
		System.out.println("after gc :"+hm);
	}

}
