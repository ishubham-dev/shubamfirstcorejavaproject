package com.javaintro;

import java.util.Scanner;

public class PrintDetails {
	public static void main  (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employe name");
		String name = sc.nextLine();
		
		System.out.println("Employee ID");
		int id =  sc.nextInt();
		
		System.out.println("Employee age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Empoyee role");
		String role = sc.nextLine();
		
		
		System.out.println("Employee Name : " +name);
		System.out.println("Employee ID: " +id);
		System.out.println("Employee Age: " +age);
		System.out.println("Employee Role: " +role);
		
		sc.close();

				
	}

}
