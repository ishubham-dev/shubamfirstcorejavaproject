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
	int princpalid;

	void changePrincpal() {
		System.out.println("PrincpalName: " + princpalname);
		System.out.println("PrincpalID: " + princpalid);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Student1 s1 = new Student1();
		s1.studentid = 101;
		s1.studentname = "shubham";
		s1.coursename = "BTECH";
		s1.marks = 100;

		Student1 s2 = new Student1();
		s2.studentid = 102;
		s2.studentname = "MicroSoft";
		s2.coursename = "Btech";
		s2.marks = 10;

		Student1 s3 = new Student1();
		s3.collegename = "NIT";
		s3.loc = "Mumbai";
		s3.collegeid = 10255;

		Student1 s4 = new Student1();
		s4.princpalname = "Dr.k.suamyaa";
		s4.princpalid = 101;

		s1.displayStudentDetails();
		
		s2.displayStudentDetails();
		
		s3.displayCollegeDetails();
		
		s4.changePrincpal();

		System.out.println("Main Method Ended");
	}

}
