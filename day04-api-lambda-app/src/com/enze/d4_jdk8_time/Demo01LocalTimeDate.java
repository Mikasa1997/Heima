package com.enze.d4_jdk8_time;

import java.time.LocalDate;

public class Demo01LocalTimeDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("今天的日期 " + localDate);

        System.out.println(localDate.getMonth().getValue());

    }
}
