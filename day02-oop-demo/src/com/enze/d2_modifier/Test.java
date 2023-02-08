package com.enze.d2_modifier;

public class Test {
    public static void main(String[] args) {
        /* 目标：讲解权限修饰符的修饰范围 */
        Father f = new Father();
        f.protectedMethod();
        f.method();
        f.publicMethod();
    }
}
