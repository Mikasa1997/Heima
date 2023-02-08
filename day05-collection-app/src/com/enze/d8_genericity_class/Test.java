package com.enze.d8_genericity_class;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //模拟Arraylist，定义MyArrayList 关注泛型设计
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
    }
}
