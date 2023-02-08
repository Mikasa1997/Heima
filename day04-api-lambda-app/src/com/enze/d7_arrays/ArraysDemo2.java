package com.enze.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //Comparator比较器的使用
        //1.Arrays的sort方法对于有值特性的数组是升序排序
        int[] age = {34, 12, 23, 42};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));

        //2.需求：降序排列
        Integer[] age2 = {34, 12, 23, 42};
        /*
         * 参数1：被排序的数组，引用类型的元素
         * 参数2：匿名内部类对象，代表一个比较器对象，制定比较规则
         * */
        Arrays.sort(age2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return -(o1 - o2);
            }
        });

        System.out.println(Arrays.toString(age2));
        System.out.println("------------------------------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("吴磊", 23, 175.5);
        students[1] = new Student("谢鑫", 18, 185.0);
        students[2] = new Student("胡恩泽", 26, 181.2);


        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });

        System.out.println(Arrays.toString(students));

    }
}
