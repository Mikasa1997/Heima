package com.enze.d2_set_demo;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张三",18);
        Student s3 = new Student("王五",20);

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);
    }
}
