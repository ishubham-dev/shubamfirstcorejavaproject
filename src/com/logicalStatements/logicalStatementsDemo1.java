package com.logicalStatements;

import java.util.InputMismatchException;
import java.util.Scanner;

public class logicalStatementsDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age");
		try {
			double age = sc.nextInt();

			if (age < 0) {
				System.out.println("Invalid age");
			}

			else if (age >= 56 && age <= 70) {
				System.out.println("You are old");
			} else if (age >= 36 && age <= 55) {
				System.out.println("You are a Senior Citizen");
			} else if (age >= 20 && age <= 35) {
				System.out.println("You Are Young");
			}

			else if (age >= 13 && age <= 19) {
				System.out.println("You are a Teenager");
			} else if (age >= 6 && age <= 12) {
				System.out.println("You are a child");
			} else if (age >= 1 && age <= 5) {
				System.out.println("You are kid");
			}

			else {
				System.out.println("You are older than 70");

			}
		} catch (InputMismatchException e) {
			System.out.println("Not a valid age");
		}
		sc.close();
	}

}
