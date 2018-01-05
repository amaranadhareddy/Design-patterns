package com.sapient.vo;

public class Customer {

	private String name;
	private String mobileNo;
	private double income;
	private Address address = new Address();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	String display() {
		return getIncome() + getMobileNo() + getName() +
				address.getAddress2(this);
	}
	
}
