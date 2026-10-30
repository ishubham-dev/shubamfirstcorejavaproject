package com.LanguageFundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class MathTest1 {
	public static void main(String[] args) {
		BigInteger num1 = new BigInteger("50");
		BigInteger num2 = new BigInteger("20");

		System.out.println("Main Method Started");
		System.out.println("Addition : " + num1.add(num2));
		System.out.println("Subtraction : " + num1.subtract(num2));
		System.out.println("Multiply : " + num1.multiply(num2));
		System.out.println("Division : " + num1.divide(num2));
		System.out.println("Modulus : " + num1.mod(num2));

		BigDecimal num3 = new BigDecimal("50.00");
		BigDecimal num4 = new BigDecimal("20.00");

		System.out.println("Addition : " + num3.add(num4));
		System.out.println("Subtraction : " + num3.subtract(num4));
		System.out.println("Multiply : " + num3.multiply(num4));
		System.out.println("Division : " + num3.divide(num4));

		System.out.println("Main Method Ended");

	}
}
