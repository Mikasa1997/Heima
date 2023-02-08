package com.enze.d6_regex;

public class Test3 {
    public static void main(String[] args) {
        String names = "晓璐jisjaiojfioasf蓉儿kosdko过儿123123____123adAAA";
        String[] arr = names.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
