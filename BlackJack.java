package com.qa.community;

public class BlackJack {
	
	public static void main(String[] args) {
		
		blackJack(10, 21);
		blackJack(20, 18);
		blackJack(1, 22);
		blackJack(22, 23);
		
	}
	
	public static void blackJack(int num1, int num2) {

		if (num1 > 21 && num2 > 21) {
			System.out.println("Play (" + num1 + ", " + num2 + ") -> " + 0);
		} else {
			if ((num1 > num2) && (num1 <= 21) || (num1 <= 21 && num2 > 21)) {
				System.out.println("Play (" + num1 + ", " + num2 + ") -> " + num1);
			} else {
				System.out.println("Play (" + num1 + ", " + num2 + ") -> " + num2);
			}

		}

	}
}