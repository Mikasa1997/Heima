package com.enze.d4_static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        SingleInstance2 instance = SingleInstance2.getInstance2();
        SingleInstance2 instance2 = SingleInstance2.getInstance2();
        System.out.println(instance2 == instance);
    }
}
