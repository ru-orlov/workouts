package com.example.user.myapplication.JavaPart;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + getFormattedPrice(payment, Locale.US));
        System.out.println("India: " + getFormattedPrice(payment, new Locale("en", "in")));
        System.out.println("China: " + getFormattedPrice(payment, Locale.CHINA));
        System.out.println("France: " + getFormattedPrice(payment, Locale.FRANCE));
    }

    static String getFormattedPrice(double payment, Locale locale){
        NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(locale);
        return usNumberFormat.format(payment);
    }

}
