package com.enze.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String code = "abc我爱你中国";
        byte[] bytes = code.getBytes("GBK"); //以当前代码默认字符集进行编码
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes.length);

        //解码
        String rs = new String(bytes,"GBK");
        System.out.println(rs);
    }
}
