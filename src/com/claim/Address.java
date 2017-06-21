package com.claim;

public class Address {
	
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	
	//Default Constructor
	public Address (){
	}
	//Parameterized Constructor
	public Address (String streetAddress, String city, String state, int zipcode){
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	//Getters & setters
	public String getStreetAddress(){
		return this.streetAddress;
	}
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state;
	}
	public int getZipcode(){
		return this.zipcode;
	}
	public void setZipcode(int zipcode){
		this.zipcode = zipcode;
	}
}
