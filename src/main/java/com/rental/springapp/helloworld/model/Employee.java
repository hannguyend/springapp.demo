package com.rental.springapp.helloworld.model;

public class Employee {
	private String id;
	private String lastName;
	private String firstName;
	private String address;
	
	public Employee(String id, String lastName, String firstName, String address){
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
