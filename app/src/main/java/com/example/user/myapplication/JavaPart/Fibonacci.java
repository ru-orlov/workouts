package com.example.user.myapplication.JavaPart;

public class Fibonacci {

    static int fSlow(int n){
        if (n < 2){
            return 1;
        } else {
            return fSlow(n-2) + fSlow(n-1);
        }
    }

    static long fFast(int n){
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; ++i) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 50; n++){
            System.out.println(fFast(n));
        }
    }
}
