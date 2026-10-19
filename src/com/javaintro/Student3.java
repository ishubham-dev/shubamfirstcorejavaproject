package com.javaintro;

public class Student3 {
	int studentid;
	String studentname;
	String coursename;
	int marks;
	String collegename;
	String principalname;

	void displayStudentDetails() {
		System.out.println("StduentID: " + studentid);
		System.out.println("StudentName: " + studentname);
		System.out.println("CourseName:" + coursename);
		System.out.println("Marks" + marks);
		System.out.println("CollegeName" + collegename);
		System.out.println("PrincpalName: " + principalname);

	}

	void displayCollegeDetails() {
		System.out.println("CollegeName: " + collegename);
		System.out.println("PrincipalName: " + principalname);

	}

	void changePrincipal(String newprincipal) {
		principalname = newprincipal;
		System.out.println("New PrincipalName " + principalname);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Student3 s1 = new Student3();
		s1.studentid = 1201;
		s1.studentname = "shubham";
		s1.coursename = "Btech";
		s1.marks = 100;
		s1.collegename = "NIT Banglore";
		s1.principalname = "DR.Somya kumari";

		Student3 s2 = new Student3();
		s2.studentid = 1202;
		s2.studentname = "MicroSoft";
		s2.coursename = "Masters";
		s2.marks = 100;
		s2.collegename = "NIT banglore";
		s2.principalname = "DR.Somya kumari";

		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s1.displayCollegeDetails();

		s1.changePrincipal("DR.S.Deepak Kumar Dhaiya");
		s1.displayCollegeDetails();

		System.out.println("Main Method Ended");

	}

}
