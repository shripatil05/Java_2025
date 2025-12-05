package com.prowings.Java2025.Exception;

public class ReturnInTryCatch {
	public static void main(String[] args) {
		
		int result = addition(10,20);
		System.out.println("Addition is :"+result);
	}
	
	public static int addition(int a ,int b) {
		try {
			a = b/0;
			return 100;
		}
		catch(Exception e) {
			return 200;
		}
		finally {
			return 300;
		}
	}

}
