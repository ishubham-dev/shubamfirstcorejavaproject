package com.javaintro;

public class MethodTest1 {
	static void method1() {
		System.out.println("Method 1 Called");

	}

	static void method2() {
		System.out.println("Method 2 called");
		method1();
	}

	void method3() {
		System.out.println("Method 3 called");
		method2();
	}

	void method4() {
		System.out.println("Method 4 called");
		method3();
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		MethodTest1 M1 = new MethodTest1();
		M1.method4();
		System.out.println("Main Method Ended");
	}

}
