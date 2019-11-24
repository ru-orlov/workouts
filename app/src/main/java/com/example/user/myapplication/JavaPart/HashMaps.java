package com.example.user.myapplication.JavaPart;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("1", "2");
        hashmap.put("1", "3");// will be replaced
        hashmap.put("3", "2");

        System.out.println(hashmap);
    }
}
