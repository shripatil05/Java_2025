package com.prowings.Java2025.string.interviewprogram;

import java.util.Arrays;

public class AnagramStringEx {
	public static void main(String[] args) {
		System.out.println("Main method started!!");
		String input1 ="ababab";
		String input2 ="aababb";
		
		if(isAnagram(input1,input2))
			System.out.println("Given string is anagram");
		else
			System.out.println("Given string is not anagram");
		
		
		System.out.println("Main method ended!!");
	}
	
	public static boolean isAnagram(String input1 ,String input2) {
		
		if(input1.length() != input2.length()) {
			System.out.println("since lengths are not equal, no need to check for anagram!!!");
		return false;
		}
		
		char[] chars1 = input1.toCharArray();
		char[] chars2 = input2.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		boolean res = false;
		
		for(int i=0;i<chars1.length;i++) {
			if(chars1[i] != chars2[i])
				break;
			else {
				res = true;
				continue;
			}
			
		}
		return res;
	}

}
