package com.prowings.Java2025.Exception;

public class CheckedExDemo {
	public static void main(String[] args) {
		Car originalCar = new Car(1234,"Audi","Black");
		
		System.out.println(originalCar);
		
		try {
			Car clonedCar = (Car) originalCar.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
