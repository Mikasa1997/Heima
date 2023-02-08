package com.enze.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //学会使用Arrays类的常用API，并理解其原理

        //1.返回数组内容
        int[] arr1 = {10, 2, 55, 23, 24, 100};
        String rs1 = Arrays.toString(arr1);
        System.out.println(rs1);

        //2.自动对数组元素进行升序排序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //3.二分搜索技术
        /*
        * 需要先排序
        * */
        int index = Arrays.binarySearch(arr1, 88);
        System.out.println(index);

    }
}
