package com.enze.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        Map<String, Integer> maps = new HashMap<>();
        Stream<String> s1 = maps.keySet().stream();
        Stream<Integer> s2 = maps.values().stream();

        Stream<Map.Entry<String, Integer>> s3 = maps.entrySet().stream();

        String[] names = {"赵敏", "小昭", "周芷若"};
        Stream<String> s4 = Arrays.stream(names);

        Stream<String> s5 = Stream.of(names);
    }
}
