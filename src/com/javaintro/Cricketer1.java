package com.javaintro;

public class Cricketer1 {
	String Cname;
	int jerseyNo;
	int highScore;

	Cricketer1(String name, int jersey, int Score) {
		this.Cname = name;
		this.jerseyNo = jersey;
		this.highScore = Score;
	}

	static String boardName = "BCCI";
	static String CountryName = "INDIA";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("BoardNAME: " + boardName);
		System.out.println("COUNTRYNAME: " + CountryName);
		Cricketer1 Dhoni = new Cricketer1("Dhoni ",07,183);
		Cricketer1 Virat = new Cricketer1("Virat ",18,183);
		Cricketer1 Rohit = new Cricketer1("Rohit ",45,209);
		Cricketer1 Steve = new Cricketer1("SteveSmith ",49,100);
		Cricketer1 Shubham = new Cricketer1("SHUBAM ",183,20000000);
		
		
		System.out.println("Cname: " +Dhoni.Cname+ ",jerseyNo: " +Dhoni.jerseyNo+ ",HighScore: " +Dhoni.highScore);
		System.out.println("Cname: " +Virat.Cname+ ",jerseyNo: " +Virat.jerseyNo+ ",HighScore: " +Virat.highScore);
		System.out.println("Cname: " +Rohit.Cname+ ",jerseyNo: " +Rohit.jerseyNo+ ",HighScore: " +Rohit.highScore);
		System.out.println("Cname: " +Steve.Cname+ ",jerseyNo: " +Steve.jerseyNo+ ",HighScore: " +Steve.highScore);
		System.out.println("Cname: " +Shubham.Cname+ ",jerseyNo: " +Shubham.jerseyNo+ ",HighScore: " +Shubham.highScore);
		

		System.out.println("Main Method Ended");

	}

}
