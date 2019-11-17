package com.example.user.myapplication.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodLinks {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Thomas"));
        cats.add(new Cat("Thomas2"));
        cats.add(new Cat("Thomas3"));
        cats.add(new Cat("Thomas4"));

        cats.removeIf(nextCat -> nextCat.equals("Thomas2"));
    }
}

class Cat {
    Cat(String name){this.name = name;}
    private String name;
}
