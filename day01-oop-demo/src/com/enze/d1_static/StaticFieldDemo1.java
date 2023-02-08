package com.enze.d1_static;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        /* 目标：理解static修饰成员变量的作用和访问特点 */
        User user = new User();
        System.out.println(User.onlineNumber);

    }
}
