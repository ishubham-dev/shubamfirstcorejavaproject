package com.javaintro;

public class Demo1 {
	{ // instance block called
		int id = 1203;
		String name = "Shubham" ;
		System.out.println("instance block executed");
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();

	}

}
