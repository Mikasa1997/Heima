package com.enze.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        System.out.println(list);
        System.out.println("---------------------------------------");
        //1.for循环方式
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }
        System.out.println("---------------------------------------");
        //2.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
        }
        System.out.println("---------------------------------------");
        //3.foreach
        for(String ele : list){
            System.out.println(ele);
        }
        System.out.println("---------------------------------------");
        //4.Lambda表达式
        list.forEach(s -> System.out.println(s));
    }
}
