package com.wipro.flowcontrolstatements;

public class EXE_1A {
	
	public static void main(String[] args) {
		int l=Integer.parseInt(args[0]);
		if(l>0)
			System.out.println("The given number is positive");
		else if(l<0)
			System.out.println("The given number is Negative");
		else
			System.out.println("The given number is Zero");
		 
	}

}
