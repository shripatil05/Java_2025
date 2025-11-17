package com.prowings.Java2025.Stringclass;

public class StringSplitMethodDemo2 {
	public static void main(String[] args) {
		String sentance = "India is my country";
		
		String[] words =sentance.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
	}

}
