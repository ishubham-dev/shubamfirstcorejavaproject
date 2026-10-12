package com.javaintro;

import java.util.Scanner;

public class Bank1 {
	int accno;
	int balance;
	String accountHolderName;
	String bankName;

	public void ReadDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Account Number");
		accno = sc.nextInt();

		System.out.println("Your Balance");
		balance = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter AccountHolderName");
		accountHolderName = sc.nextLine();

		System.out.println("BankName");
		bankName = sc.nextLine();

	}

	public void PrintDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Number: " + accno);
		System.out.println("Balance: " + balance);
		System.out.println("AccountHolderName: " + accountHolderName);
		System.out.println("BankName: " + bankName);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Bank1 b1 = new Bank1();
		b1.ReadDetails();
		b1.PrintDetails();

		System.out.println("Main Method Ended");

	}
}
