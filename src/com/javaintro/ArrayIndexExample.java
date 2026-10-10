package com.javaintro;

public class ArrayIndexExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 4th element: " + numbers[3]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed!");
        }
    }
}
