package com.enze.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);
        System.out.println("-------------------------------------");
        //1.得到当前集合的迭代器对象
        //next  先取元素后以为
//        String ele = iterator.next();
//        System.out.println(ele);

        for (String ele : lists) {
            System.out.println(ele);
        }
        lists.forEach(System.out::println);

        double[] arr = {0.1, 0.2, 0.3, 0.44};
        for(double ele : arr){
            System.out.println(ele);
        }
    }
}
