package com.enze.d3_collections;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        names.add("楚留香");
//        names.add("楚留香");
//        names.add("楚留香");
//        names.add("楚留香");
        Collections.addAll(names, "胡恩泽", "高婉莹");
        System.out.println(names);

        //2.打乱
        Collections.shuffle(names);
        System.out.println(names);
        //3.按照默认规则排序
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 23, 14, 19, 28);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------------------------------------");
        List<Apple> list1 = new ArrayList<>();
        Collections.addAll(list1, new Apple("红富士", "红色", 9.9, 500),
                new Apple("青苹果", "绿色", 19.2, 300),
                new Apple("普通苹果", "黄色", 5.3, 400));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("-----------------------------------------");
        Collections.sort(list1, Comparator.comparingDouble(Apple::getPrice));
        System.out.println(list1);

    }
}
