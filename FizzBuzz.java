package com.qa.community;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		multiples(10);
		multiples(9);
		multiples(15);
		multiples(23);
		
	}
	
	public static void multiples(int i) {

		if (i % 5 == 0 && i % 3 != 0) {
			System.out.println("Buzz (Multiple of 5)");
		}

		if (i % 3 == 0 && i % 5 != 0) {
			System.out.println("Fizz (Multiple of 3)");
		}
		
		if ((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println("FizzBuzz (Multiple of 3 and 5)");
		}
		
		if (i % 3 != 0 && i % 5 != 0) {
			System.out.println(i + " (Not a multiple of 3 or 5)");
		}

	}

}
