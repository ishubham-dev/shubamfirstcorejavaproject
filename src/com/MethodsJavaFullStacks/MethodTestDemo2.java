package com.MethodsJavaFullStacks;

import java.util.Scanner;

public class MethodTestDemo2 {
	ArithmeticException E;
	Scanner sc = new Scanner(System.in);

	void addition() {
		System.out.println("Addition Method Called");
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void subtraction() {
		System.out.println("Subtraction Method Called");
		int a = 100;
		int b = 25;
		System.out.println(a - b);

	}

	void multiplication() {
		System.out.println("multiplication Method Called");
		int a = 15;
		int b = 2;
		System.out.println(a * b);
	}

	void division() {
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value b");
		int b = sc.nextInt();
		try {

			System.out.println("Division Result : " + (a / b));

		} catch (ArithmeticException E) {
			System.out.println("Cannot Divide By zero");

		}
	}

	void modulus() {
		System.out.println("Modulus Method Called");
		int a = 100;
		int b = 25;
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		MethodTestDemo2 t = new MethodTestDemo2();
		t.addition();
		t.subtraction();
		t.multiplication();
		t.division();
		t.modulus();
		System.out.println("Main Method Ended");

	}

}
