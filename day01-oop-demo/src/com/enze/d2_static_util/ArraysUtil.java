package com.enze.d2_static_util;

public class ArraysUtil {
    private ArraysUtil() {

    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return null;
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += i == arr.length - 1 ? arr[i] : arr[i] + ", ";
        }
        result += "]";
        return result;
    }

    public static double getAerage(double[] list) {
        double max = list[0], min = list[0];
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
            if (min > list[i]) {
                min = list[i];
            }
            sum += list[i];
        }
        return (sum - max - min) / (list.length - 2);
    }
}
