package com.enze.d2_recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        System.out.println("------------------test 被执行-----------------");
    }
    public static void test2(){
        System.out.println("------------------test2 被执行-----------------");
        test();
    }
}
