package com.enze.d1_static;

public class Test {
    /*
     * 静态成员变量
     * */
    public static int onlineNumber = 13;

    public static void test2() {

        /*
         * 实例成员
         * */
        

    }

    public static void test() {
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        test2();
        Test.test2();
    }

    public static void main(String[] args) {
        /* 目标：了解static 访问相关的语法 */

    }
}
