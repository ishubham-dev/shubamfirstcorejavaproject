package com.javaintro;

public class MethodTest2 {
	static void method1() {
		String name = "SHUBHAM";
		System.out.println("STUDENT NAME :" + name);
	}

	static void method2() {
		String dept = "IT";
		System.out.println("DEPARTMENT :" + dept);
		method1();
	}

	void method3() {
		int marks = 100;

		System.out.println("MARKS :" + marks);
		method2();
	}

	void method4() {
		char grade = 'A';
		System.out.println("GRADE " + grade);
		method3();
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		MethodTest2 M2 = new MethodTest2();
		M2.method4();
		System.out.println("Main Method Ended");
	}
}
