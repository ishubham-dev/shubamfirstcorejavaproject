package com.javaintro;

public class Welcome {

    public static void main(String[] args) {
        System.out.println("Hello Welcome to java");
        System.out.println("Hello Welcome to java");
        System.out.println("Hello Welcome to java");
        System.out.println("Hello Welcome to java");

        Sum s = new Sum();
        int result = s.add(5, 10);
        System.out.println("Sum is: " + result);
    }
}
class Sum {
    int add(int a, int b) {
        return a + b;
    }
}
