package com.example.user.myapplication.JavaPart;

import java.lang.reflect.Method;

public class JavaGenerics {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }

    static class Printer {

        <T>void printArray(T a[]){
            for(T item:a){
                System.out.println(item);
            }
        }
    }

}
