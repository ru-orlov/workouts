package com.example.user.myapplication.JavaPart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

    public static void main(String[] args) throws ParseException {
        System.out.println(findDay(8, 8, 2015));

    }

    public static String findDay(int month, int day, int year) throws ParseException {
        String strDate = "" + day + " " + month + " " + " " + year;
        Date date = new SimpleDateFormat("dd MM yyyy").parse(strDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return getStringFromNumberDay(dayOfWeek);
    }

    public static String getStringFromNumberDay(int dayOfWeek) {
        if (dayOfWeek == Calendar.SUNDAY) {
            return "SUNDAY";
        } else if (dayOfWeek == Calendar.MONDAY) {
            return "MONDAY";
        } else if (dayOfWeek == Calendar.TUESDAY) {
            return "TUESDAY";
        } else if (dayOfWeek == Calendar.WEDNESDAY) {
            return "WEDNESDAY";
        } else if (dayOfWeek == Calendar.THURSDAY) {
            return "THURSDAY";
        } else if (dayOfWeek == Calendar.FRIDAY) {
            return "FRIDAY";
        } else if (dayOfWeek == Calendar.SATURDAY) {
            return "SATURDAY";
        }
        return "";
    }
}