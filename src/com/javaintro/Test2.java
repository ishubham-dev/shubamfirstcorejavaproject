package com.javaintro;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.javaintro.Details");
		System.out.println("✅ Class found");
	}
}
