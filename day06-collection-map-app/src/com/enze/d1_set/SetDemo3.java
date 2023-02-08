package com.enze.d1_set;

import java.util.*;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(23);
        set1.add(24);
        set1.add(12);
        set1.add(8);
        System.out.println(set1);
        System.out.println("------------------------------");

        Set<String> set2 = new TreeSet<>();
        set2.add("Java");
        set2.add("MySQL");
        set2.add("About");
        set2.add("Adout");
        set2.add("PHP");
        set2.add("Python");
        set2.add("Aaout");
        System.out.println(set2);
        System.out.println("------------------------------");

        Set<Apple> set3 = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight() >= 0 ? -1 : 1;
            }
        });
        Apple a1 = new Apple("红富士", "红色", 9.9, 500);
        Apple a2 = new Apple("青苹果", "绿色", 15.9, 300);
        Apple a3 = new Apple("绿苹果", "青色", 29.9, 400);
        Apple a4 = new Apple("黄苹果", "黄色", 9.8, 500);

        set3.add(a1);
        set3.add(a2);
        set3.add(a3);
        set3.add(a4);
        System.out.println(set3);
    }
}
