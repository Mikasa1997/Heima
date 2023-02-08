package com.enze.d5_map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();//一行经典代码
        maps.put("iphoneX",10);
        maps.put("娃娃",20);
        maps.put("iphoneX",100);
        maps.put("huawei",100);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        //1. 清空集合
//        maps.clear();
//        System.out.println(maps);
        //2.判断集合是否为空
        System.out.println(maps.isEmpty());
        //3.根据键获取对应的值
        Integer key = maps.get("huawei");
        System.out.println(key);
        Integer key1 = maps.get("huawei2");
        System.out.println(key1);
        //4.根据键值删除整个元素
        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps);
        //5.判断是否包含某个键值
        System.out.println(maps.containsKey("手表"));
        //6.判断是否包含某个值
        System.out.println(maps.containsValue(100));
        //7.获取全部键的集合
        Set<String> set = maps.keySet();
        System.out.println(set);
        //8.获取全部值的集合
        Collection<Integer> values = maps.values();
        System.out.println(values);
        //9.集合的大小
        System.out.println(maps.size());
        //10.合并集合
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Java1",10);
        map2.put("金瓶梅",20);
        map2.put("huawei",1);
        maps.putAll(map2);
        System.out.println(maps);
    }
}
