package com.example.user.myapplication.JavaPart;

import java.util.Scanner;

public class StdinAndStdout_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a= new int[3]; //creating array
        for (int i=0;i<3;i++)
            a[i] = scan.nextInt();
        scan.close();
        for(int j=0;j<3;j++)
            System.out.println(a[j]);
    }
}
