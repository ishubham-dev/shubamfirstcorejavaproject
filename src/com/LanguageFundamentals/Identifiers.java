package com.LanguageFundamentals;

public class Identifiers {
	int age;
	String name;
	char grade;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Identifiers I = new Identifiers();
		System.out.println(I.age);
		System.out.println(I.name);
		System.out.println(I.grade);
		I.Students();

	}

	void Students() {
		System.out.println("Student Details");
	}

}
