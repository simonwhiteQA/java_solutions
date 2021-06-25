package com.qa.community;

public class FlowchartRecreate {
	
	public static void main(String[] args) {
		
		chart(5032);
		
	}
	
	public static void chart(int a) {
		
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			}
			if (a < 6000) {
				System.out.println("B");
			}
			if (a > 4000 && a <6000) {
				System.out.println("D");
			}
			if (a < 4000) {
				System.out.println("E");
			}
		}
			
		if (a < 2000) {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
			}
			if (a < 100) {
				System.out.println("2");
			}
			if (a > 600) {
				System.out.println("5");
			}
			if (a < 600 && a > 100) {
				System.out.println("4");
			}
			if (a > 500) {
				System.out.println("6");
			}
			if (a < 500 && a > 100) {
				System.out.println("7");
			}
		}
	}
}
