package com.example.user.myapplication.JavaPart;

public class StringOrder {
    public static void main(String[] args) {
        String s = "";
        int k = 0;
        String smallest = s.substring(0, k);
        String largest = "";
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0) smallest = s.substring(i, i + k);
            if (s.substring(i, i + k).compareTo(largest) > 0) largest = s.substring(i, i + k);
        }
    }
}
