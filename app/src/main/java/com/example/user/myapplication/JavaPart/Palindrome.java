package com.example.user.myapplication.JavaPart;

import com.example.user.myapplication.JavaPart.arrays.Array2d;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        String A = "aabbbbaa";
        List list = new ArrayList<>();
        list.add("dasf");
        list.add(1);

        if (isEven(A)){
            StringBuilder result = halfStrToSbDirect(A, 0);
            StringBuilder resultRevert = halfStrToSbRevert(A, 0);
            if (result.toString().equals(resultRevert.toString())) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            StringBuilder result = halfStrToSbDirect(A, 1);
            StringBuilder resultRevert = halfStrToSbRevert(A, 1);
            if (result.toString().equals(resultRevert.toString())) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static StringBuilder halfStrToSbRevert(String str, int tale){
        StringBuilder resultSb = new StringBuilder();
        int limit = (str.length()-tale);
        for (int i = limit; i>limit/2; i--){
            resultSb.append(str.charAt(i));
        }
        return resultSb;
    }

    private static StringBuilder halfStrToSbDirect(String str, int tale){
        StringBuilder resultSb = new StringBuilder();
        int limit = (str.length()-tale)/2;
        for (int i = 0; i< limit; i++){
            resultSb.append(str.charAt(i));
        }
        return resultSb;
    }

    private static boolean isEven(String str){
        return str.length()%2 == 0;
    }
}
