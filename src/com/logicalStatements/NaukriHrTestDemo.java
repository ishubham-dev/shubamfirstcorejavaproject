package com.logicalStatements;

import java.util.Scanner;

public class NaukriHrTestDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name");
		String name = sc.nextLine();

		System.out.println("Enter Your CGPA");
		double cgpa = sc.nextDouble();

		if (cgpa >= 7) {
			System.out.println("You are Eligible for the role");
		} else {
			System.out.println("CGPA NOT AS PER EXPECTATION");
			return;
		}
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();

		if (age >= 18) {
			System.out.println("You Can Apply for the job");
		} else {
			System.out.println("Not Elgible for job");

		}

		System.out.println("Enter Your College Course");
		String course = sc.nextLine();

		if (course.equalsIgnoreCase("BTECH") || course.equalsIgnoreCase("M-TECH")
				|| course.equalsIgnoreCase("MASTERS")) {
			System.out.println("Course ACCEPTED	");
		} else {
			System.out.println("PROFILE NOT MATCHING");
		}

		System.out.println("YEARS OF EXPERIANCE");
		double exp = sc.nextDouble();
		sc.nextLine();

		if (exp >= 3) {
			System.out.println("GREAT !! PERFECT ");

		} else {
			System.out.println("OH NEED TO BE EXPERIANCED");
		}

	}
}
