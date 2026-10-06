package com.javaintro;

public class Test1 {
	public static void main(String[] args) {
		int age = 28;

		try {
			if (age < 18) {

				throw new Exception("NOT Elgible to vote");
			} else {
				System.out.println("Elgible for vote");
			}
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
			e.printStackTrace();
		}

	}
}
