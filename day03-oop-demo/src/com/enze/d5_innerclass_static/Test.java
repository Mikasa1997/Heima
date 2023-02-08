package com.enze.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.inner in = new Outer.inner();
        in.setName("张三");
        in.show();
    }
}
