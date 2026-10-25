package com.LanguageFundamentals;

public class GarbageTest {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		GarbageTest t = new GarbageTest();
		t = null;
		t = new GarbageTest();
		new GarbageTest();
		t.Garbage();
		System.gc();

		System.out.println("Main Method Ended");
	}

	void Garbage() {
		System.out.println("Object Garbage Collected");
	}

}
