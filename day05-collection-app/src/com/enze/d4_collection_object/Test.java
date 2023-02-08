package com.enze.d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;


public class Test {
    public static void main(String[] args) {
        Collection<Movies> movies = new ArrayList<>();
        Movies m1 = new Movies("《你好，李焕英》",9.5,"贾玲");
        Movies m2 = new Movies("《唐人街探案》",8.5,"王宝强");
        Movies m3 = new Movies("《刺杀小说家》",8.6,"雷佳音");

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        movies.forEach(movies1 -> System.out.println(movies1.toString()));
    }
}
