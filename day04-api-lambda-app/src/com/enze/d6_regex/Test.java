package com.enze.d6_regex;

public class Test {
    public static void main(String[] args) {
        //需求：校验QQ号，必须全是数字， 6-20位
//        System.out.println(checkQQ("779271970"));
//        System.out.println(checkQQ("779271a10"));

        System.out.println(checkQQRegex("779271970"));
        System.out.println(checkQQRegex("779271a10"));

    }

    public static boolean checkQQRegex(String qq) {
        //1.判断QQ号码的长度是否满足要求
        return qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ(String qq) {
        //1.判断QQ号码的长度是否满足要求
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        //2.判断QQ中是否全部是数字 779271970
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            //判断这个字符是否不是数字，如果不是数字，直接返回false
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
