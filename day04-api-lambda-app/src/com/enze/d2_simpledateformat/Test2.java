package com.enze.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2021年08月06日11点11分11秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
        Date parse = sdf.parse(dateStr);
        long time = parse.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        String format = sdf.format(time);
        System.out.println(format);
    }
}
