package com.prowings.Java2025.Exception;

public class DataConvertion2 {
	public static void main(String[] args) {
		
		String s= "123";
		
		Integer a = Integer.parseInt(s);
		
		int multiplication = a*2;
		
		System.out.println(multiplication);
		
		String condition = "true";
		
		boolean con = Boolean.parseBoolean(condition);
		
		if(con) {
			System.out.println("Correct");
		}
		else
			System.out.println("Incorrect");
	}

}
