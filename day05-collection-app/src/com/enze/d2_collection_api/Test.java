package com.enze.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        //1.添加元素，添加成功返回true
        c.add("Java");
        c.add("HTML");
        c.add("HTML");
        c.add("MySQL");
        c.add("Java");
        c.add("恩泽");
        System.out.println(c);
        System.out.println("-------------------------------------");
        //2.清空集合的元素
//        c.clear();
//        System.out.println(c);
        //3.判断集合是否为空，是空为TRUE
        System.out.println(c.isEmpty());
        //4.获取集合的大小
        System.out.println(c.size());
        //5.判断集合中是否包含某个元素
        System.out.println(c.contains("恩泽"));
        System.out.println("-------------------------------------");
        //6.删除某个元素，如果有多个重复元素，那么会默认删除前面的第一个元素
        System.out.println(c.remove("Javaa"));
        System.out.println(c);
        System.out.println(c.remove("Java"));
        System.out.println(c);
        System.out.println("-------------------------------------");
        //7.把集合转换为数组
        Object[] array = c.toArray();
        System.out.println("数组" + Arrays.toString(array));
        System.out.println("-------------------------------------");
        //8.将两个集合的元素进行合并
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add("Java");
        c1.add("Java2");
        c2.add("赵敏");
        c2.add("殷素素");
        //addAll : 把 c2的元素全部倒入到c1中
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
