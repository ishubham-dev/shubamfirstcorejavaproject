package com.LanguageFundamentals;

public class Test5 {
	Test5 t;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		t1.t = t2;
		t2.t = t1;
		t1 = null;
		t2 = null;
		System.gc();
		System.out.println("Object are ready for Garbage collection");
		System.out.println("Main Method Ended");

	}

}
