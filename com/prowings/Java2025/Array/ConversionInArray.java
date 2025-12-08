package com.prowings.Java2025.Array;

import java.util.Arrays;

public class ConversionInArray {
public static void main(String[] args) {
		
		int i = 20;
		
		long j = i; //implicit promotion
		int x = (int)j; //explicit promotion

		int[] num1 = {10,20,30};
		
//		long[] num2 = num1; //this is not supported because - Arrays are objects and implicit/explicit promotions are only supported for primitives

//		Integer[] num2 = num1; //this is not supported because - Autoboxing/Autounboxing are not supported on array

		//Conversion 1: implicit/explicit promotions - not directly supported - only supported at element level
		//Conversion 2: Autoboxing/AutoUnboxing promotions - not directly supported - only supported at element level
		
		long[] num2 = new long[num1.length];
		
		int index = 0;
		for(int n : num1)
		{
			num2[index] = n;
			index++;
		}
		
		System.out.println(Arrays.toString(num2));
		
		
		Integer[] num3 = new Integer[num1.length];
		
		for(int k=0; k<num1.length;k++)
		{
			num3[k] = num1[k];
		}
		System.out.println("Integer array : "+Arrays.toString(num3));
		
		
		System.out.println("-------------------------------");
		//conversion 3: upcasting and downcasting - this is allowed
		
		String[] strArray = {"hii","hello"};
		
		Object[] objArray = strArray; //upcasting
		
		for(Object o : objArray)
		{
			String s = (String)o;
			System.out.println(s);
		}
 		
		System.out.println("------downcasting---------");
		String[] strar = (String[])objArray; //downcasting
		
		for(String s : strar)
			System.out.println(s);

		
	}

}
