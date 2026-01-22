package com.prowings.Java2025.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorithmMethodsDemo3 {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sachin");
		myList.add("Pradip");
		myList.add("Abhinav");
		
		System.out.println("Before reversing :"+myList);
		
		
		Collections.reverse(myList);
		
		System.out.println("After sorting :"+myList);
	}

}
