package com.greatlearning.model; //pojo, they represent data

public class Employee {
	private String firstName;
	private String lastName;

	public Employee(){ // default constructor
		firstName = "";
		lastName = "";
	}	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	

}
