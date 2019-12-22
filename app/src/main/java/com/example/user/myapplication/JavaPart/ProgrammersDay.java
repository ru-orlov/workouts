package com.example.user.myapplication.JavaPart;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProgrammersDay {


    static String dayOfProgrammer(int year) {
        GregorianCalendar c = (GregorianCalendar) GregorianCalendar.getInstance();
        c.set(Calendar.YEAR, year);
        int counter = 0;
        int leap = c.isLeapYear(year) ? 1 : 0;
            for (int i = 0; i < 8; i++){
               c.set(Calendar.MONTH, i);
               counter += c.getActualMaximum(Calendar.DAY_OF_MONTH);
            }
        return String.valueOf((256 - counter - leap)) + ".09."+year;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2016));
    }
}
