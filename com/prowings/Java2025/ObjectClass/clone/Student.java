package com.prowings.Java2025.ObjectClass.clone;

public class Student implements Cloneable{
	private int rollNumber;
	private String name;
	private int age;
	private double marks;
	
	public Student() {
		super();
	}

	public Student(int rollNumber, String name, int age, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
			return marks;
	}

	public void  setMarks(double marks) {
		if(marks<35)
		{
			this.marks = marks;
			System.out.println(this.name+" : Fail");	
		}
		else if((marks>=35) && marks<=60)
		{
			this.marks= marks;
			System.out.println(this.name+" : Pass");
		}
		else if((marks>60) && (marks<=85))
		{
			this.marks=marks;
			System.out.println(this.name+" : First class");
		}
		else if((marks>85) && (marks<=100))
		{
			this.marks= marks;
			System.out.println(this.name+" : First class with distinction");
		}
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
	

}
