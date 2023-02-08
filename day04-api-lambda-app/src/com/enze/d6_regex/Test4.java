package com.enze.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java，电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn，电话18762832633,0203232323" +
                "邮箱b0zai@itcast.cn，400-100-3233 ，4001003232";
        String regex = "(\\w{1,30}@[\\w&&[^_]]{2,20}(\\.[\\w&&[^_]]{2,20}){1,2})" +
                "|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})" +
                "|(400-?\\d{3}-?\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rs);
        while (matcher.find()){
            String rsult = matcher.group();
            System.out.println(rsult);
        }
    }
}


/*
*
* String rs="来黑马程序学习Java，电话020-43422424，或者联系邮箱"+
"itcast@itcast.cn，电话18762832633,0203232323" +
"邮箱b0zai@itcast.cn，400-100-3233 ，4001003232"；*/
