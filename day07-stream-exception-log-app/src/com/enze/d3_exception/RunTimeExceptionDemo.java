package com.enze.d3_exception;

import java.util.Objects;

public class RunTimeExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始--------->");
        //1.数组索引越界异常 ArrayIndexOutOfBoundsException
/*        int[] arr = {1,2,3};
        System.out.println(arr[2]);
        System.out.println(arr[3]);*/

        //2.空指针异常 NullPointerException
/*        String name = null;
        System.out.println(name.length());*/

        //3.类型转换异常 ClassCastException
/*        Object it = 23;
        String s = (String) it;*/

        //4.数学操作异常 ArithmeticException
      /*  int c = 10/0;*/

        //5.数字转换异常 NumberFormatException
        String num = "23.02";
        Integer it = Integer.valueOf(num);
        System.out.println(it);

    }
}
