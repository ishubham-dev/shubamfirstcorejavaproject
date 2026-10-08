package com.javaintro;

public class Car {
	String CarName;
	int ModelYear;
	int TotalSpeed;

	Car(String name, int Year, int Speed) {
		this.CarName = name;
		this.ModelYear = Year;
		this.TotalSpeed = Speed;

	}
	static String companyName = "Ferrari";
	static String CountryOrigin = "USA"; 

	public static void main(String[] args) {
		String showroom = "Hyd";
		System.out.println("Main Method Started");
		System.out.println("CompanyName: " +companyName);
		System.out.println("CountryName: " +CountryOrigin);
		Car Tesla = new Car("Tesla",2018,300);
		Car BMW = new Car("BMW",2020,200);
		Car Audi = new Car("Audi",2014,250);
		Car Toyata = new Car("Toyata",2022,500);
		
		System.out.println("CarName: " +Tesla.CarName+ ",ModelYear: "+Tesla.ModelYear+ ",TotalSpeed :" +Tesla.TotalSpeed);
		System.out.println("CarName: " +BMW.CarName+ ",ModelYear: "+BMW.ModelYear+ ",TotalSpeed :" +BMW.TotalSpeed);
		System.out.println("CarName: " +Audi.CarName+ ",ModelYear: "+Audi.ModelYear+ ",TotalSpeed :" +Audi.TotalSpeed);
		System.out.println("CarName: " +Toyata.CarName+ ",ModelYear: "+Toyata.ModelYear+ ",TotalSpeed :" +Toyata.TotalSpeed);
		System.out.println("Showroom: "+showroom);
	
		System.out.println("Main Method Ended");
		
	}

}
