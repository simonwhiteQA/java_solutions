package com.qa.community;

public class UniqueSum {
	
	public static void main(String[] args) {
		
		unique(1, 2, 3);
		unique(3, 3, 3);
		unique(1, 1, 2);
		
	}
	
	public static void unique(int num1, int num2, int num3) {

		if(num1 == num2 && num2 == num3) {
			System.out.println("0");
		} else {
			if(num1 == num2) {
				System.out.println(num3);
			} else {
				if(num2 == num3) {
					System.out.println(num1);
				} else {
					if(num1 != num2 && num1 != num3) {
						System.out.println(num1+num2+num3);
					}
				}
					
			}
		}
		
	}
}
