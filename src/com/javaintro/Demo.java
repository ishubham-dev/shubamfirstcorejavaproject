package com.javaintro;

public class Demo {
	static {
		int x = 30;
		int y = 40;
		int Sum = x + y;

		System.out.println("Static block Executed" + x);
		System.out.println("Static block Executed" + y);
		System.out.println("Static block Executed" + Sum);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Executed");

	}

	static {
		System.out.println("Static Block 2 Execcuted");
	}

}
