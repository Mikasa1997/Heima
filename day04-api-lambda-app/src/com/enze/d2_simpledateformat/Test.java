package com.enze.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, EEE, a, HH:mm:ss");
        String rs = sdf.format(d);
        System.out.println(rs);
    }
}
