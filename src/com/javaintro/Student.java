package com.javaintro;

public class Student {
	String name = "Shubham";
	int Rollno= 2004;
	int age = 25;
	String email= "ishubham183@gmail.com";
	Long PhoneNo = 6300637971L;
	
	void students() {
	System.out.println("Name:"+ name);
	System.out.println("Rollno:"+ Rollno);
	System.out.println("age:"+ age);
	System.out.println("email:"+ email);
	System.out.println("PhoneNO:"+ PhoneNo);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student s = new Student();
		s.students();
		System.out.println("main method ended");
	}
	
	}
