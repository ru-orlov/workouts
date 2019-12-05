package com.example.user.myapplication.JavaPart.arrays;

public class LeftRotation {

    static int[] rotLeft(int[] arr, int d) {
        int n = arr.length;
        int[] rotated = new int[n];
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int shift = 2;
        rotLeft(arr, shift);
    }
}
