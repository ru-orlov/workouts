package com.example.user.myapplication.JavaPart;

import java.io.*;
import java.util.*;


/*
* Search a count of pair socks
*/

public class SocksMerchant {
    static int sockMerchant(int[] ar) {
        Map<Integer, Integer> sockGroupsCount = new HashMap<>();
        for (int i = 0; i < ar.length; i++){
            if(sockGroupsCount.containsKey(ar[i])) {
                int count = sockGroupsCount.get(ar[i]);
                sockGroupsCount.put(ar[i], count + 1);
            } else {
                sockGroupsCount.put(ar[i], 1);
            }
        }
        int pairs = 0;
        for(int count : sockGroupsCount.values()) {
            pairs += count / 2;
        }

        return pairs;
    }


    public static void main(String[] args) throws IOException {
        int[] arrr = {1,2,2,4,3,2,1};

        System.out.println(sockMerchant(arrr));
    }
}
