package com.enze.d2_recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }

}
