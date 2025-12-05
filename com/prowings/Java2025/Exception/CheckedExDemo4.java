package com.prowings.Java2025.Exception;

public class CheckedExDemo4 {
	public static void main(String[] args) {
		try {
			Class carClass = Class.forName("Car.class");
		}
		catch(ClassNotFoundException e) {
//			System.out.println("ClassNotFoundException occurred...");
			e.printStackTrace();
		}
	}

}
