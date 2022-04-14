package com.wipro.calc;

import java.util.Scanner;

//Class Name and File Name are same
public class Calculator {
	// Entry Point of Java Program
	public static void main(String args[]) {
	
		
		Scanner scan=new Scanner(System.in);
		// Variables  -  Local 
		int numberOne,numberTwo,result;
		System.out.println("Enter Number 1");
		numberOne=scan.nextInt();
		System.out.println("Enter Number 2");
		numberTwo=scan.nextInt();
		Addition ad = new Addition();
		result=ad.add(numberOne, numberTwo);
		
		System.out.println("Addition of Two Number " + result);
		System.out.println("Welcome to Stackroute Program");
		
		
	}
	
	// Predefined Class --  Starts with UpperCase 
	// String / System
	
	
	
	
}


