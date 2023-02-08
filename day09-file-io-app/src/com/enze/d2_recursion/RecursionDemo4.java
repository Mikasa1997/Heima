package com.enze.d2_recursion;

/* 猴子偷桃问题*/
public class RecursionDemo4 {
    public static void main(String[] args) {
        System.out.println(num(1));
    }

    public static int num(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 * num(n + 1) + 2;
        }
    }
}
