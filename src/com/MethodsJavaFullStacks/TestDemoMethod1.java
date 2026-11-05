package com.MethodsJavaFullStacks;

public class TestDemoMethod1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		hello();
		TestDemoMethod1 t = new TestDemoMethod1();
		t.welcome();

		System.out.println("Main Method Ended");

	}

	public static void hello() {
		System.out.println("Good Morning");
	}

	void welcome() {
		System.out.println("Welcome to INDIA");
	}

}
