package com.LanguageFundamentals;

public class Test {
	Test ref;

	public static void main(String[] args) {

		Test a = new Test();
		Test b = new Test();
		a.ref = b;
		b.ref = a;
		a = null;
		b = null;
		System.out.println("Garbage Gc collected");
	}
}
