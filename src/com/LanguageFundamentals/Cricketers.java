package com.LanguageFundamentals;

public class Cricketers {
	int age = 38;
	String name = "Virat kohli";
	String team = "INDIA";
	Address address = new Address();

	class Address {
		String city = "Delhi";
		String country = "INDIA";
	}

	public static void main(String[] args) {
		Cricketers c1 = new Cricketers();
		System.out.println(c1.age);
		System.out.println(c1.name);
		System.out.println(c1.team);
		System.out.println(c1.address.city);
		System.out.println(c1.address.country);
	}

}
