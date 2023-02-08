package com.enze.d3_params;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //1.不传参数
        sum();
        sum(10);
        sum(10, 20);
        sum(new int[]{10, 20, 30, 40, 50});


    }

    public static void sum(int... nums) {
        System.out.println("元素个数" + nums.length);
        System.out.println("元素内容" + Arrays.toString(nums));
    }
}
