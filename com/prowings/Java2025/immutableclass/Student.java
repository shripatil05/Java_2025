package com.prowings.Java2025.immutableclass;

public final class Student {
	
	private final int rollnumber;
	private final String name;
	private final Address address;
	
	public Student(int rollnumber, String name, Address address) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		//this.address = address;
		Address addrCopy = new Address();
		addrCopy.setPin(address.getPin());
		addrCopy.setCity(address.getCity());
		this.address = addrCopy;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address dummyAdd = new Address();
		dummyAdd.setPin(address.getPin());
		dummyAdd.setCity(address.getCity());
		return dummyAdd;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", address=" + address + "]";
	}	

}
