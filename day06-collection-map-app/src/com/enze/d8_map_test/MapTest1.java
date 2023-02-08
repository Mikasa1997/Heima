package com.enze.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest1 {
    public static void main(String[] args) {
        String[] selects = {"A", "B", "C", "D"};
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
    }
}
