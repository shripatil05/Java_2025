package com.prowings.Java2025.Enum;

public class WithoutEnumDemo {
	public static void main(String[] args) {
		String size = "null";
		
		int sizeInNumbeer = getSizeInNumber(size);
		
		System.out.println("Size in number :"+sizeInNumbeer);
		
	}
		
	public static int getSizeInNumber(String size) {
		
		int result = 0;
		
		if(size == null || size.isBlank()) {
			return 0;
		}
		
		switch(size.toUpperCase()) {
		
		case "SMALL":
			result = 28;
			break;
			
		case "MEDIUM":
			result = 32;
			break;
			
		case "LARGE":
			result = 38;
			break;
			
		case "EXTRALARGE":
			result = 42;
			break;
			
		default :
			result = 0;
			break;
			
			
		}
		
		return result;
	}

}
