package com.enze.d2_static_util;

public class Test {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        double[] list2 = {1,2,3,4,5};
        int[] list3 = {};
        int[] list4 = null;
        System.out.println(ArraysUtil.toString(list));
        System.out.println(ArraysUtil.getAerage(list2));
        System.out.println(ArraysUtil.toString(list3));
        System.out.println(ArraysUtil.toString(list4));
    }
}
