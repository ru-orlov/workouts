package com.example.user.myapplication.interview;

import java.util.*;

public class DistancesNumbers {
    static int distClosestNumbers(int[] numbers) {
        int newLength = numbers.length;
        List list = new ArrayList();
        int[] copiedArray = Arrays.copyOf(numbers, newLength);
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < copiedArray.length; j++){
                if (numbers[i] > copiedArray[j]){
                    if (numbers[i]-copiedArray[j] > 0) {
                        list.add(numbers[i] - copiedArray[j]);
                    }
                } else {
                    if (copiedArray[j]-numbers[i] > 0){
                        list.add(copiedArray[j]-numbers[i]);
                    }
                }
            }
        }
        return (int) list.get(list.indexOf(Collections.min(list)));
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
