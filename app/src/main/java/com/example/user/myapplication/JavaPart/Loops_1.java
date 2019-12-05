package com.example.user.myapplication.JavaPart;

import java.util.Scanner;

public class Loops_1 {

    private static final Scanner scanner = new Scanner(System.in);

    private static void solution(int N){
        for (int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = "+ N*i);
        }
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        solution(N);
        scanner.close();
    }
}
