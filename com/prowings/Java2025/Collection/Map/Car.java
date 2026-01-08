package com.prowings.Java2025.Collection.Map;

public class Car {
	private int id;
	private String companyName;
	private Double price;
	
	public Car() {
		super();
	}
	
	public Car(int id, String companyName, Double price) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", companyName=" + companyName + ", price=" + price + "]";
	}
	
	

}
