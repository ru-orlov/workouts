package com.example.user.myapplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

public class Equlity {

    public static void main(String[] args) {
        Map map = new HashMap();
        Map myMap = Collections.synchronizedMap(map);



    }

    @Target(value= ElementType.METHOD)
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface StartObject {
    }

}
