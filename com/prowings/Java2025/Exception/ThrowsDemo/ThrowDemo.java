package com.prowings.Java2025.Exception.ThrowsDemo;

public class ThrowDemo {
	public static void main(String[] args) {
		System.out.println("main method started!!");
		try {
			isValidVoter(19, "ABCD");
		} catch (InvalidVoterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method ended!!");
	}

	
	public static boolean isValidVoter(int age, String country) throws InvalidVoterException
	{
		boolean result;
		if(age>=18)
		{
			System.out.println("age is valid.. checking country");
			
			if(country.equalsIgnoreCase("india"))
			{
				System.out.println("valid country");
				System.out.println("he is valid voter!!");
				System.out.println("Eligible for Vote!!");
				result = true;
			}
			else
				throw new InvalidVoterException();
		}
		else
			throw new InvalidVoterException();
		
		return result;
	}

}
