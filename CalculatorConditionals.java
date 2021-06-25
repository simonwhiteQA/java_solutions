package com.qa.community;

public class CalculatorConditionals {
	
	public static void main(String[] args) {
		// 1. Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters.
		System.out.println(addition(20, 50));
		
		// 2.a Multiplication - which takes two numbers and returns the product.
		System.out.println(multiply(2, 50));
		
		// 2.b Subtraction - which takes two numbers, then returns the result of the subtraction.
		System.out.println(subtract(150, 25));
		
		// 2.c Division - which takes two numbers, then returns the result of the division.
		// ALWAYS USE DOUBLE FOR DIVISION FOR DECIMAL TO BE APPLICABLE
		divide(80, 22);
		
	}
	
	public static int addition(int num1, int num2) {
		return num1+num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public static int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public static void divide(double num1, double num2) {
		if (num1>num2){
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Division cannot be performed");
		}
	}

}
