package com.demo.assignment;

public class Largest {
 int a,b,c,d;  
 
 public void max(int a,int b,int c)
 { 
	 d=c>(a>b ? a:b)? c :((a>b)?a:b);
	System.out.println(d);
	 
 }
	public static void main(String[] args) {
		Largest d=new Largest();
		d.max(12,73,2);

	}

}
