package com.javaintro;
import java.util.Scanner;

public class StudentMarks {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Student name");
		String name = sc.nextLine();
		
		System.out.println("Enter the marks in subject Science ");
		int Science= sc.nextInt();
		
		System.out.println("Enter the marks in subject Maths");
		int Maths= sc.nextInt();
		
		System.out.println("Enter the marks in subject Physics");
		int Physics= sc.nextInt();
		
		int total = Science + Maths + Physics;
		double avg = total/3.0;
		
		char grade;
		
		if (avg >= 75){ 
			grade = 'A';}
		else if (avg >=50) {
			grade = 'B'; 
			}
		else {grade = 'c';
		
		}
			
		System.out.println("Name:" +name);
		System.out.println("Total:" +total);
		System.out.println("avg:" +avg);
		System.out.println("grade:" +grade);
		
	}

}
