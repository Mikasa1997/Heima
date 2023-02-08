package com.enze.d3_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavacExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date = "2015-01-12 10:23:21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
}
