package com.enze.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();//一行经典代码
        maps.put("iphoneX", 10);
        maps.put("娃娃", 20);
        maps.put("iphoneX", 100);
        maps.put("huawei", 100);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);

        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "---->" + value);
        }

        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }

        maps.forEach((k, v) -> System.out.println(k + "---->" + v));
    }
}
