package com.prowings.Java2025.Array;

public class ArrayClassName {
	public static void main(String[] args) {
		byte[] byteArray = new byte[5];
		System.out.println("byte array name :"+byteArray.getClass().getName());
		
		short[] shortArray = new short[5];
		System.out.println("short array name : " + shortArray.getClass().getName());

		char[] charArray = new char[5];
		System.out.println("char array name : " + charArray.getClass().getName());

		int[] numbers = new int[5]; // this will create an array of size 5 and of type - int
		System.out.println("int array name : " + numbers.getClass().getName());

		long[] longArray = new long[5];
		System.out.println("long array name : " + longArray.getClass().getName());

		float[] floatArray = new float[5];
		System.out.println("float array name : " + floatArray.getClass().getName());

		double[] doubleArray = new double[5];
		System.out.println("double array name : " + doubleArray.getClass().getName());

		boolean[] booleanArray = new boolean[5];
		System.out.println("boolean array name : " + booleanArray.getClass().getName());

		// Non-Primitive arrays

		String[] stringArray = new String[5];
		System.out.println("String array name : " + stringArray.getClass().getName());

		Integer[] integerArray = new Integer[5];
		System.out.println("Integer array name : " + integerArray.getClass().getName());

		System.out.println(integerArray[0]);
		System.out.println(integerArray[1]);
		System.out.println(integerArray[2]);
		System.out.println(integerArray[3]);
		System.out.println(integerArray[4]);
		
		
		Character[] characterArray = new Character[5];
		System.out.println("Character array name : " + characterArray.getClass().getName());

	}

}
