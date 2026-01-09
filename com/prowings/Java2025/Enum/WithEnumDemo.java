package com.prowings.Java2025.Enum;

public class WithEnumDemo {
	public static void main(String[] args) {
		
		Size size = Size.SMALL;
		
		int sizeInNumber = getSizeInNumber(size);
		
		System.out.println("Size in number is :"+sizeInNumber);
	}

	public static int getSizeInNumber(Size size) {
		
		int result = 0;
		switch(size) {
		
		case Size.SMALL:
			result = 28;
			break;
			
		case Size.MEDIUM:
			result = 32;
			break;
			
		case Size.LARGE:
			result = 38;
			break;
			
		case Size.EXTRALARGE:
			result = 42;
			break;
			
		default :
			System.out.println("Entered size is not valid...");
			result =0;
		}
		
		return result;
	}

}
