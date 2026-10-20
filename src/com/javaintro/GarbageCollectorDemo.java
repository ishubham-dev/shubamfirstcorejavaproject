package com.javaintro;

public class GarbageCollectorDemo {

    public void display() {
        System.out.println("Object is being used");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called for object");
    }

    public static void main(String[] args) {

        GarbageCollectorDemo obj1 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo();

        obj1.display();
        obj2.display();

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}