package com.LanguageFundamentals;

public class PrimitiveDataTypesDemo {
	byte age = 25;
	short pincode = (short) 500087;
	int rollno = 1203;
	long phoneno = 96405678L;
	float height = 5.6f;
	double marks = 98.6d;
	char grade = 'A';
	boolean result = true;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		PrimitiveDataTypesDemo D1 = new PrimitiveDataTypesDemo();
		System.out.println("AGE: " + D1.age);
		System.out.println("PINCODE: " + D1.pincode);
		System.out.println("ROLLNO: " + D1.rollno);
		System.out.println("PHONENO: " + D1.phoneno);
		System.out.println("HEIGHT: " + D1.height);
		System.out.println("MARKS: " + D1.marks);
		System.out.println("GRADE: " + D1.grade);
		System.out.println("RESULT: " + D1.result);
	}

}
