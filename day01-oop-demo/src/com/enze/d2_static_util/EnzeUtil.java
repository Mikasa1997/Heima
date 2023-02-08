package com.enze.d2_static_util;

import java.util.Random;

public class EnzeUtil {
    private EnzeUtil(){

    }
    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd = new Random();
        /* 随机索引对应的字符 */
        for (int i = 0; i < n; i++) {
            int index = rd.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }


}
