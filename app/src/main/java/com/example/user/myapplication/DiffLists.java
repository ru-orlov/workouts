package com.example.user.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DiffLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");

        list.add(2, "sdf");

        System.out.println(list.get(2));
    }
}
