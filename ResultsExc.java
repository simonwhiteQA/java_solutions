package com.qa.community;

public class ResultsExc {

	public static void main(String[] args) {

		method_one(50, 130, 100);
		method_two(50, 130, 100);
		method_three(50, 130, 100);

	}

	public static void method_one(int result1, int result2, int result3) {
		if(result1>=90) {
			System.out.println("Physics = " + result1 + "/150 (PASS)\r\n");
		} else {
			System.out.println("Physics = " + result1 + "/150 (FAIL)\r\n");
		} if (result2>=90) {
			System.out.println("Chemistry = " + result2 + "/150 (PASS)\r\n");
		} else {
			System.out.println("Chemistry = " + result2 + "/150 (FAIL)\r\n");
		} if (result3>=90) {
			System.out.println("Biology = " + result3 + "/150 (PASS)\r\n");
		} else {
			System.out.println("Biology = " + result3 + "/150 (FAIL)\r\n");
		} 
		

	}

	public static void method_two(int result1, int result2, int result3) {
		int total = result1 + result2 + result3;
		int percent = total * 100 / 450;
		
		if (percent>60){
			System.out.println(percent + "% (PASS)");
		}
		else {
			System.out.println(percent + "% (FAIL)");
		} 
		
	}
	
	public static void method_three(double result1, double result2, double result3) {
		double resultPercent1 = result1/150*100;
		double resultPercent2 = result2/150*100;
		double resultPercent3 = result3/150*100;
		
		if (resultPercent1 >=60 && resultPercent2 >=60 && resultPercent3 >=60) {
			System.out.println("Overall Result: PASS");
		} else {
			System.out.println("Overall Result: FAIL");
		}
		
	}
	
		
}
