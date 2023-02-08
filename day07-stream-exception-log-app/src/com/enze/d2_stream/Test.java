package com.enze.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张三丰", "张三丰","周芷若", "赵敏", "张强");
        System.out.println(list);
        //1.filter 过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        //2.count
        System.out.println(list.stream().filter(s -> s.length() == 3).count());
        //3.limit 取前几个元素
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        //4.skip 跳过前两个元素
        list.stream().filter(s -> s.length() == 3).skip(2).forEach(System.out::println);
        //5.map加工方法  给集合元素的前面都加上一个 "恩泽的"
        //第一个参数：原材料 -> 第二个参数：加工后的结果
        list.stream().map(s -> "恩泽的" + s).forEach(System.out::println);
        System.out.println(list);
        //6.把所有的名称都加工成一个学生对象
        list.stream().map(s -> new Student(s)).forEach(System.out::println);
        System.out.println("-------------------------------");
        //7.concat 合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1","Java2");
        Stream<String> s3 = Stream.concat(s1,s2);

        s3.distinct().forEach(System.out::println);

    }
}
