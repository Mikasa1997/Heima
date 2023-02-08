package com.enze.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /* 目标：明确Collection集合体系的特点 */
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        System.out.println(list);

        System.out.println("------------------------------------");

        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        System.out.println(list1);

        System.out.println("------------------------------------");

        Collection<String> list2 = new ArrayList<>();
        list2.add("Mybatis");

        //集合和泛型不支持基本数据类型，只能使用引用数据类型
        Collection<Integer> list3 = new HashSet();
        list3.add(23);

    }
}

interface USB{

}
