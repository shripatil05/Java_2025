package com.prowings.Java2025.ObjectClass.clone.deep;

public class Employee implements Cloneable{
	private int empId;
	private String name;
	private PermanentAddress address;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, PermanentAddress address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PermanentAddress getAddress() {
		return address;
	}

	public void setAddress(PermanentAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		PermanentAddress pa = (PermanentAddress) address.clone();
		Employee e = (Employee) super.clone();
		e.setAddress(pa);
		return e;
	}
	
	
	

}
