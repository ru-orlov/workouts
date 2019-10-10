package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    static int getBird(List<Integer> ar) {
        int counter[] = new int[ar.size()];
        int result = 1; int max = 0;
        for (int i = 0; i < ar.size(); i++) {
            counter[ar.get(i)]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //List<Integer> birds = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4));
        List<Integer> birds = new ArrayList<>(Arrays.asList(1,4,4,4,5,3));
        System.out.println(getBird(birds));
    }
}
