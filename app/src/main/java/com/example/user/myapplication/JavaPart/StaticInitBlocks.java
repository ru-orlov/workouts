package com.example.user.myapplication.JavaPart;

public class StaticInitBlocks {

    private static final boolean flag;
    private static int B, H;

    static {
        flag = true;
        B = 1;
        H = 3;
    }



    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
