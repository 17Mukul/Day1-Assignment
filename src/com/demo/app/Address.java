package com.demo.app;

public class Address {
	private String doorNo; 
	private String city;
	private int pinCode;
public Address(String doorNo,String city,int pinCode)
{
	this.doorNo=doorNo; 
	this.city=city; 
	this.pinCode=pinCode;	
} 
public String getAddress() {
	return this.doorNo + " " + this.city + " " + this.pinCode; 
}

}
