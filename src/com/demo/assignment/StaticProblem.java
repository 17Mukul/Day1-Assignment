package com.demo.assignment;

public class StaticProblem {

	   private static int eId;

	   
	   public static final String name = "Mukul Sharma ";

	   public static void main(String args[]) {
	     eId = 101;
	      
	      StaticProblem s = new StaticProblem();
	      System.out.println(eId +  StaticProblem.name);
	      
	      System.out.println(s.method1());
	      
	      System.out.println(s.method2());
	   }
}
