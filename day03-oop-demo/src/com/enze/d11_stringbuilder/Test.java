package com.enze.d11_stringbuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("我爱你中国");
        stringBuilder.append('你');
        System.out.println(stringBuilder);

        String s1 = "我爱你中国";
        System.out.println(s1);
    }
}
