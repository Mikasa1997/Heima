package com.enze.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("Start!");
        parseTime("2015-01-12 10:23:21");
        System.out.println("End");
    }
    public static void parseTime(String date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);
            InputStream is = new FileInputStream("C:/meimv.jpg");
        } catch (Exception  e) {
            e.printStackTrace();
        }
    }
}
/*
*       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
* */