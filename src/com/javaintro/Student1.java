package com.javaintro;

public class Student1 {
	int studentid;
	String studentname;
	String coursename;
	int marks;

	void displayStudentDetails() {
		System.out.println("StudentID: " + studentid);
		System.out.println("StudentName: " + studentname);
		System.out.println("CourseName: " + coursename);
		System.out.println("Marks: " + marks);

	}

	String collegename;
	String loc;
	int collegeid;

	void displayCollegeDetails() {
		System.out.println("CollegeName: " + collegename);
		System.out.println("Location: " + loc);
		System.out.println("CollegeID: " + collegeid);

	}

	String princpalname;
	int principalid;

	void changePrincipal() {
		System.out.println("PrincipalName: " + princpalname);
		System.out.println("PrincipalID: " + principalid);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Student1 s1 = new Student1();
		s1.studentid = 101;
		s1.studentname = "shubham";
		s1.coursename = "BTECH";
		s1.marks = 100;

		s1.studentid = 102;
		s1.studentname = "Microsoft";
		s1.coursename = "Masters";
		s1.marks = 100;

		s1.collegename = "NIT";
		s1.loc = "Mumbai";
		s1.collegeid = 10255;

		s1.princpalname = "Dr.k.suamyaa";
		s1.principalid = 101;

		s1.displayStudentDetails();
		s1.displayCollegeDetails();
		s1.changePrincipal();

		System.out.println("Main Method Ended");
	}

}
