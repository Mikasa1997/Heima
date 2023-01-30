package com.enze.bean;

import com.enze.run.MovieSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Map<String,List<Double>> listMap = new HashMap<>();
        System.out.println(scores);
        listMap.put("name",scores);
        List<Double> name = listMap.get("name");
        System.out.println(name);
    }
}
