package com.example.user.myapplication.interview;

import java.math.BigInteger;

public class ScaryCode {
    public static void main(String[] args) {
        equalsVsequals();
    }

    private static void equalsVsequals(){
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b); // true or false?
        System.out.println(c == d); // true or false?

        //Because integer values between -128 and 127 are cached, but 128 is not.
    }

    private static void bigDecimal(){
        BigInteger b = new BigInteger("1000");
        b.add(new BigInteger("2"));
        System.out.println(b);
    }

    private static void toUpperCase(){
        String s = "abc";
        s.toUpperCase();
        System.out.println(s);
    }
}
