package com.enze.d4_static_singleinstance;

public class Test {
    public static void main(String[] args) {
        SingleStance s1 = SingleStance.instance;
        SingleStance s2 = SingleStance.instance;
        System.out.println(s1 == s2);
    }
}
