package com.javaintro;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.javaintro.Details");
			System.out.println("Class found");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
			e.printStackTrace();

		}
	}
}      