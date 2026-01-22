package com.prowings.Java2025.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorithmMethodsDemo8 {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sachin");
		myList.add("Sham");
		myList.add("Pradip");
		myList.add("Abhinav");
		myList.add("Sham");
		
		System.out.println("Original list :"+myList);
		
		Collections.swap(myList, 0, 6);
		
		System.out.println("After swap :"+myList);
		
		String str = "Sham";
		
		int occurance = Collections.frequency(myList, str);
		
		System.out.println(str +" occured " + occurance + " times!!");
	}

}
