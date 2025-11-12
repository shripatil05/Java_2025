package com.prowings.Java2025.ObjectClass.clone;

public class Employee implements Cloneable{
	private int empId;
	private String empName;
	private String empAddress;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String empAddress, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", salary=" + salary
				+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
