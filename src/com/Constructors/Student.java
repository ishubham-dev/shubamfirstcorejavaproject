package com.Constructors;

public class Student {

	int studentid;
	String studentname;
	int studentmarks;

	Student() {
		studentid = 1201;
		studentname = "SHUBHAM";
		studentmarks = 100;

	}

	void student() {
		System.out.println("STUDENTID : " + studentid);
		System.out.println("STUDENTID : " + studentname);
		System.out.println("STUDENTID : " + studentmarks);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student s = new Student();
		s.student();
		System.out.println("Main Method Ended");

	}
}

// first attenpt
//package com.Constructors;

//public class Student {
// int studentid;
// String studentname;
// int studentmarks;

// void student() {
// System.out.println("Student Details");
// this.studentid = 1201;
// this.studentname = "SHUBHAM";
// this.studentmarks = 100;
// System.out.println("STUDENT ID : " + studentid);
// System.out.println("STUDENT NAME : " + studentname);
// System.out.println("STUDENT MARKS : " + studentmarks);
// }

// public static void main(String[] args) {
// System.out.println("Main Method Started");
// Student s = new Student();
// s.student();
// System.out.println("Main Method Ended");

// }
