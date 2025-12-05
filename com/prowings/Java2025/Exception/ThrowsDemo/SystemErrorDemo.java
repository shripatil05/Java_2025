package com.prowings.Java2025.Exception.ThrowsDemo;

public class SystemErrorDemo {
public static void main(String[] args) {
		
		System.out.println("Helloo!!!");
		
		System.err.println("Hiiii");
		
		try
		{
			try 
			{
				int res = 10/0;
				
			}
			catch (ArithmeticException e) {
				System.out.println("converting and rethrowing");
				RuntimeException ex = new RuntimeException("Wrapped ex",e);
				throw ex;
			}
		}
		catch (Exception e) {
			
			System.out.println("catched exception!!");
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		
	}

}
