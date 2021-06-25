package com.qa.community;

import java.text.DecimalFormat;

public class Coins {
	
	public static void main(String[] args) {
		
		//change(4.58, 20);
		//change(7, 10);
		//change(8.50, 25.60);
		change(5.57, 20);
		change(15.43, 100);
		change(12.41, 20);
		
	}
	
	public static void change(double cost, double amount) {
		
		double change = amount-cost;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		System.out.println("Your change is: £" + numberFormat.format(change));
		System.out.println("---Notes and Coins---");
		int twentyPound = 0;
		int tenPound = 0;
		int fivePound = 0; 
		int twoPound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		if (change > 0.00) {
			while (change >= 20) {
				twentyPound++;
				change -= 20;
			}

			if (twentyPound > 0) {
				System.out.println(twentyPound + " TwentyPounds");
			}

			while (change >= 10) {
				tenPound++;
				change -= 10;
			}

			if (tenPound > 0) {
				System.out.println(tenPound + " TenPounds");
			}

			while (change >= 5) {
				fivePound++;
				change -= 5;
			}

			if (fivePound > 0) {
				System.out.println(fivePound + " FivePounds");
			}

			while (change >= 2) {
				twoPound++;
				change -= 2;
			}

			if (twoPound > 0) {
				System.out.println(twoPound + " TwoPounds");
			}

			while (change >= 1) {
				onePound++;
				change -= 1;
			}

			if (onePound > 0) {
				System.out.println(onePound + " OnePounds");
			}

			while (change >= 0.50) {
				fiftyPence++;
				change -= 0.50;
			}

			if (fiftyPence > 0) {
				System.out.println(fiftyPence + " FiftyPence");
			}

			while (change >= 0.20) {
				twentyPence++;
				change -= 0.20;
			}

			if (twentyPence > 0) {
				System.out.println(twentyPence + " TwentyPence");
			}

			while (change >= 0.10) {
				tenPence++;
				change -= 0.10;
			}

			if (tenPence > 0) {
				System.out.println(tenPence + " TenPence");
			}

			while (change >= 0.05) {
				fivePence++;
				change -= 0.05;
			}

			if (fivePence > 0) {
				System.out.println(fivePence + " FivePence");
			}

			while (change > 0.01) {
				twoPence++;
				change -= 0.02;
			}

			if (twoPence > 0) {
				System.out.println(twoPence + " TwoPence");
			}

			while (change >= 0) {
				onePence++;
				change -= 0.01;
			}

			if (onePence > 0) {
				System.out.println(onePence + " OnePence");
			}

		}
		
		System.out.println("---------------------");
		
		
	}
	

}
