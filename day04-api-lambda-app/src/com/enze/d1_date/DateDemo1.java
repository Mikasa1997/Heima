package com.enze.d1_date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
