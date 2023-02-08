package com.enze.d5_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 多态
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        //1.在某个索引插入元素
        list.add(2,"HTML");
        System.out.println(list);
        //2.根据索引删除元素,并返回删除的元素
        System.out.println(list.remove(2));
        System.out.println(list);
        //3.根据索引取元素
        System.out.println(list.get(2));
        //4.修改某个索引处的元素值
        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);

    }
}
