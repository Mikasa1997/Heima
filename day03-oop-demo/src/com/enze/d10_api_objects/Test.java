package com.enze.d10_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = "恩泽教育";
        String s2 = null;
//        System.out.println(s1.equals(s2)); //隐患！！！出现空指针异常

        System.out.println(s1.equals(s2));
    }
}
