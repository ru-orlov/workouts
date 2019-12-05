package com.example.user.myapplication.JavaPart;

import java.util.Scanner;

public class StdinAndStdout_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        double b = scan.nextDouble();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        // Complete this line
        // Complete this line
        System.out.println(b);
        System.out.println(c);
    }
}
