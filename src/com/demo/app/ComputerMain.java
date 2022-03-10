package com.demo.app;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
			Computer[] c=new Computer[3];
			c[0]=new Computer(15,"Wired","black","Ryzen5");
			c[1]=new Computer(24,"Wireless","grey","Intel i9");
			c[2]=new Computer(17,"Wired","red & black","Itel i3");
		
			for (Computer computer : c) {
				System.out.println(computer.getComputer());
			}
		
		}

	}


