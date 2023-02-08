package com.enze.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        //1. 正向格式化
        System.out.println(dtf.format(dt));
        //2. 反向格式化
        System.out.println(dt.format(dtf));

        //3. 解析时间
        String someDate = "2018-11-13, 23:08:32";
        LocalDateTime ldt1 = LocalDateTime.parse(someDate, dtf);
        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfYear());
    }
}
