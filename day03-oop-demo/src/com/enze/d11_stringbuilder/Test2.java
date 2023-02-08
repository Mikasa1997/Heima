package com.enze.d11_stringbuilder;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(toString(arr1));
        int[] arr2 = null;
        System.out.println(toString(arr2));
    }

    public static String toString(int[] arr) {
        if (arr != null) {
            StringBuilder str = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                str.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            str.append("]");
            return str.toString();
        } else {
            return null;
        }
    }
}
