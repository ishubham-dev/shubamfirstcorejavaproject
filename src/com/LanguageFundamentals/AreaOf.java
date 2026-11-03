package com.LanguageFundamentals;

import java.util.Scanner;

public class AreaOf {
	static double ariTriangle(double base, double height) {
		return 0.5 * base * height;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base :");
		double b = sc.nextDouble();
		System.out.println("Enter the height :");
		double h = sc.nextDouble();
		double area = ariTriangle(b, h);
		System.out.println("Area of Triangle : " + area);

	}

}
