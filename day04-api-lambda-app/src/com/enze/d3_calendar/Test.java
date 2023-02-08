package com.enze.d3_calendar;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //1. 拿到日历对象
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int mm = calendar.get(Calendar.MONTH) + 1;
        System.out.println(mm);
        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
        System.out.println("==========================================");
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DAY_OF_WEEK, 0);
        System.out.println(calendar.getTime());

        long time = calendar.getTimeInMillis();
        System.out.println(time);

    }
}
