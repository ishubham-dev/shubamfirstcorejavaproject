package com.javaintro;

public class Test3 {

	public static void main(String[] args) throws ClassNotFoundException { // i forget to use throws keyword before the
																			// exception type
		Class.forName("com.javaintro.Student");
		System.out.println("Class Found  Student");
		Class.forName("com.javaintro.Message");
		System.out.println("Class Found Message");

	}

}
