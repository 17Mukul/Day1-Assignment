package com.demo.app;

public class Customer { 
	
 private int customerId;
 private String customerName;
 private Address shippingAddress;
 public Customer(int customerId, String customerName, String doorNo,String city, int pinCode)
 {
	 this.customerId = customerId;
	 this.customerName = customerName; 
	 this.shippingAddress =new Address(doorNo, city, pinCode);
 } 
 public String getCustomerDetails()
 {
	 return customerId+" "+ customerName +" "+ shippingAddress.getAddress();
 }
}
