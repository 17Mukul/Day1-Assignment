package com.demo.assignment;

public class PersonalLoan { 
	private double amount; 
	private int month; 
	private float interestPercent; 
	private double totalamount;
	public void loanamount(double amount,int month,float interestPercent)
	{
		totalamount=(amount*month*interestPercent)/100; 
		System.out.println(totalamount);
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public float getInterestPercent() {
		return interestPercent;
	}
	public void setInterestPercent(float interestPercent) {
		this.interestPercent = interestPercent;
	}
	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	} 
	

}
