package com.qa.community;

public class TeamChallenge {

	public static void main(String[] args) {
		recursion(1);
	}

	public static void recursion(int num) {
		if (num <= 3000) {
			System.out.println("index: " + num++ + " Team 4");
			recursion(num);
		}
	}

}
