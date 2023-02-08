package com.enze.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("素素");
        System.out.println(list);
        System.out.println("----------------------------------");

        //1.删除全部的Java元素。
        //a.迭代器遍历再删除
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String ele = iterator.next();
//            if (ele.equals("Java")) {
//                //list.remove("Java");
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//        System.out.println("----------------------------------");
        //b.foreach遍历再删除
        for (String ele : list) {
            if(ele.equals("Java")){
                //list.remove("Java");

            }
        }
        System.out.println(list);
    }
}
