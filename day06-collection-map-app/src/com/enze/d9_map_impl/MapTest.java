package com.enze.d9_map_impl;

import com.enze.d1_set.Student;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "A", "C", "D");
        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "A");
        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3, "B");
        map.put("小胡", selects1);
        map.put("小高", selects2);
        map.put("小董", selects3);
        System.out.println(map);
        System.out.println("-----------------------------------");

        Collection<List<String>> values = map.values();

        Map<String, Integer> rs = new HashMap<>();
        for (List<String> value : values) {
            for (String s : value) {
                if (rs.containsKey(s)) {
                    rs.put(s, rs.get(s) + 1);
                } else {
                    rs.put(s, 1);
                }
            }
        }
        System.out.println(rs);

    }
}

/*
*         String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length - 1)]);
        }
        System.out.println(sb);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
* */