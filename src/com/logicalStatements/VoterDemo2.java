package com.logicalStatements;

import java.util.Scanner;

public class VoterDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		try {
			double age = sc.nextDouble();

			if (age > 18) {
				System.out.println("Elgible For voting");

			} else if (age <= 18) {
				System.out.println("Not Elgible For voting");
			}
		} catch (ArithmeticException e) {
			System.out.println("Invalid voter");
			sc.close();

		}
	}
}
