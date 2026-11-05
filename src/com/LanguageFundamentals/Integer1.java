package com.LanguageFundamentals;

import java.math.BigInteger;

import java.math.BigDecimal;

public class Integer1 {
	public static void main(String[] args) {
		BigInteger v1 = new BigInteger("50");
		BigInteger v2 = new BigInteger("25");

		System.out.println("ADDITION : " + v1.add(v2));
		System.out.println("SUBTRACTION : " + v1.subtract(v2));
		System.out.println("MULTIPLICATION : " + v1.multiply(v2));
		System.out.println("DIVISION : " + v1.divide(v2));
		System.out.println("MODULUS : " + v1.mod(v2));

		BigDecimal v3 = new BigDecimal("50.00");
		BigDecimal v4 = new BigDecimal("25.00");

		System.out.println("ADDITION : " + v3.add(v4));
		System.out.println("SUBTRACTION : " + v3.subtract(v4));
		System.out.println("MULTIPLICATION : " + v3.multiply(v4));
		System.out.println("DIVISION : " + v3.divide(v4));

	}

}

//public class Integer {
// BigInteger a = 100;
// BigDecimal b = 10.0;

// public static void main(String[] args) {
// BigInteger B1 = new BigInteger();
// BigDecimal B2 = new BigDecimal();
// System.out.println(Add.a + b);
// System.out.println(subtract.a - b);
// System.out.println(multiplay.a * b);
// System.out.println(divide.a / b);
// System.out.println(mod.a % b);
// }

//}
