package com.example.user.myapplication.JavaPart;


public class IfElse {

    static String getTypeDigit(Integer N){
        if(N%2==1 || (N>=6 && N <= 20)){
            return "Weird";
        }else{
            return "Not Weird";
        }
    }

    public static void main(String[] args) {
        Integer integer = 3;
        System.out.println(getTypeDigit(integer));
    }
}
