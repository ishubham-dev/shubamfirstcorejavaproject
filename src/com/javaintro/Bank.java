package com.javaintro;

public class Bank {
	int accno;
	int balance;
	String accountHolderName;
	String bankName;

	public void Display() {
		System.out.println("AccountNumber: " + accno);
		System.out.println("BalanceAmount: " + balance);
		System.out.println("AccountHolderName: " + accountHolderName);
		System.out.println("BankName: " + bankName);

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Bank b1 = new Bank();
		b1.accno = 101;
		b1.balance = 2000;
		b1.accountHolderName = "Shubham";
		b1.bankName = "SBI";

		Bank b2 = new Bank();
		b2.accno = 102;
		b2.balance = 4000;
		b2.accountHolderName = "MicroSoftwali";
		b2.bankName = "YONO";

		Bank b3 = new Bank();
		b3.accno = 110;
		b3.balance = 10;
		b3.accountHolderName = "MESSI";
		b3.bankName = "Lucious";

		Bank b4 = new Bank();
		b4.accno = 107;
		b4.balance = 07;
		b4.accountHolderName = "DHONI";
		b4.bankName = "SBI";

		b1.Display();
		b2.Display();
		b3.Display();
		b4.Display();

		System.out.println("Main Method Ended");

	}
}
