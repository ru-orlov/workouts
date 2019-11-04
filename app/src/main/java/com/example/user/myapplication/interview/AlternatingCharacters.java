package com.example.user.myapplication.interview;

public class AlternatingCharacters {


    static int alternatingCharacters(String str) {
        int count = 0;
        char temp = '\u0000';
        for (int i = 0; i < str.length(); i++) {
            if (temp == '\u0000') {
                temp = str.charAt(i);
            } else {
                if (temp == str.charAt(i)){
                    count++;
                } else {
                    temp = str.charAt(i);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testString = "AAABBB";
        int result = alternatingCharacters(testString);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
