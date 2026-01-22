package com.prowings.Java2025.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorithmMethodsDemo1 {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sachin");
		myList.add("Pradip");
		myList.add("Abhinav");
		
		System.out.println("Before sorting :"+myList);
		
//		Collections.sort(myList);
		
		Collections.sort(myList, new StringDescendingComparator());
		
		System.out.println("After sorting :"+myList);
	}

}
