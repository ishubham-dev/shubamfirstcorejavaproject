package com.LanguageFundamentals;

public class PrimitiveDataTypes {
	byte b = 127;
	short s = 25024;
	int i = 20;
	long l = 6879686987L;
	float f = 2.09f;
	double d = 40.2;
	char c = 'S';
	boolean boo = false;

	public static void main(String[] args) {
		PrimitiveDataTypes p = new PrimitiveDataTypes();
		System.out.println("byte :  " + p.b);
		System.out.println("Short :  " + p.s);
		System.out.println("int :  " + p.i);
		System.out.println("long :  " + p.l);
		System.out.println("float :  " + p.f);
		System.out.println("double :  " + p.d);
		System.out.println("char :  " + p.c);
		System.out.println("boolean :  " + p.boo);
	}
}
