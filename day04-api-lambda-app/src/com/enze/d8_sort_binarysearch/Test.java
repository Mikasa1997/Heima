package com.enze.d8_sort_binarysearch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 14, 16, 25, 28, 30, 35, 88, 100};
        int index = binarySearch(arr,10);
        System.out.println(index);

    }

    /**
     * 二分查找算法的实现
     *
     * @param arr  排序的数组
     * @param data 要找的数据
     * @return 索引值，如果元素不存在，直接返回-1
     */
    public static int binarySearch(int[] arr, int data) {
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min) / 2;

        int index = 0;

        while (true) {
            if (data < arr[mid]) {
                max = mid - 1;
            } else if (data > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
            mid = (max + min) / 2;
            if (max < min) {
                return -1;
            }
        }

    }
}
