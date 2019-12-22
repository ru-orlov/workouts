package com.example.user.myapplication.JavaPart;

import java.util.*;

public class ComparablePart {
    public static void main(String[] args) {
        List stringValues = new LinkedList();
        stringValues.add(new Cars("mercedes", "red", 1000));
        stringValues.add(new Cars("volvo", "black", 400));
        stringValues.add(new Cars("ford", "white", 110));
        stringValues.add(new Cars("mitsubishi", "green", 1200));

        Comparator<Cars> customComparator = new Comparator<Cars>() {
            @Override
            public int compare(Cars car1, Cars car2) {
                if (car1.getPrice() > car2.getPrice()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(stringValues, customComparator);

        for (Object obj: stringValues){
            System.out.println(obj);
        }
    }
}