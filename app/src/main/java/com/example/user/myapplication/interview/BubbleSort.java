package com.example.user.myapplication.interview;

public class BubbleSort {

    public static int[] customBubble(int[] numArray){
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
        return numArray;
    }

    public static void main(String[] args) {
        int[] data = {6,2,4,1};
        customBubble(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

}
