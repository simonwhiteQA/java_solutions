package com.qa.community;

public class FlowchartExc {
	
	public static void main(String[] args) {
		
		flowchartMethod(2, 5, true);
		flowchartMethod(2, 5, false);
		flowchartMethod(20, 12, true);
		flowchartMethod(15, 7, false);
		
	}
	
	public static void flowchartMethod(int num1, int num2, boolean bool) {
			if (bool == true) {
				System.out.println(num1+num2);
			} else {
				System.out.println(num1*num2);
			}
	}

}
