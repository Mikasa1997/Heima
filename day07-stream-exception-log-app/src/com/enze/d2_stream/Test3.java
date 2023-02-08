package com.enze.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张三丰", "张三丰", "周芷若", "赵敏", "张强");

        Stream<String> stringStream = list.stream().filter(s-> s.startsWith("张"));
        List<String> zhangList = stringStream.collect(Collectors.toList());
    }
}
