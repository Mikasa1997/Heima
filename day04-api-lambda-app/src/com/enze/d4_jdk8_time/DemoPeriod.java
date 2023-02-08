package com.enze.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DemoPeriod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1997,11,13);
        System.out.println(Period.between(today, birthday));

        System.out.println(ChronoUnit.YEARS.between(today, birthday));
    }
}
