package com.claim;

public class Person {
	
	private String firstName;
	private String lastName;
	//for phone book, no age needed
	private String age;
	private String telephone;
	//for phone book application, no GPA needed
	private double gpa;
	private Address address;

	
	//Default Constructor
	public Person(){
	}
	//Parameterized Constructor
	public Person(String firstName, String lastName, String age, String telephone, double gpa, Address address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age; 
		this.telephone = telephone;
		this.gpa = gpa;
		this.address = address;
	}
	//getters & setters
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getAge(){
		return this.age;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getTelephone(){
		return this.telephone;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public double getGpa(){
		return this.gpa;
	}
	public void setGpa(double gpa){
		this.gpa = gpa;
	}
	
	//this instance of getters & setters speaks between classes: Student & Address
	public Address getAddress(){
		return this.address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
}