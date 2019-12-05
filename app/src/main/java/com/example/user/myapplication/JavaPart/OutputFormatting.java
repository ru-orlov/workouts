package com.example.user.myapplication.JavaPart;

import java.util.Scanner;

public class OutputFormatting {

    static String addLeadingZeros(int inputValue){
        StringBuilder sb = new StringBuilder();
        String strValue = inputValue+"";
        for (int j = 3 - strValue.length(); j > 0; j--)
            sb.append("0");

        sb.append(strValue);
        return sb.toString();
    }

    static String addSpaceChars(String inputValue){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15 - inputValue.length(); i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if (i == 0){System.out.println(s1 + addSpaceChars(s1) + addLeadingZeros(x));}
            if (i == 1){System.out.println(s1 + addSpaceChars(s1) + addLeadingZeros(x));}
            if (i == 2){System.out.println(s1 + addSpaceChars(s1) + addLeadingZeros(x));}
        }
        System.out.println("================================");
    }
}
