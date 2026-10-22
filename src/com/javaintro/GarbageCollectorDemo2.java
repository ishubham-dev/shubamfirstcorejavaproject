package com.javaintro;

public class GarbageCollectorDemo2 {

	///@override//
	protected void finalize() {
		System.out.println("Object is Garbage Collected");

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		GarbageCollectorDemo2 d = new GarbageCollectorDemo2();
		d = new GarbageCollectorDemo2();
		d = null;
		new GarbageCollectorDemo2();
		System.gc();

		System.out.println("Main Method Ended");
	}

}
