package com.enze.d13_interface_jdk8;

public interface SportMan {
    default void run(){
        System.out.println("跑的很快");
        play();
    }
    void competition();
    public static void eat(){
        System.out.println("我们都在学习Java新增的语法，他是Java源码自己会用到的");
    }
    private void play(){
        System.out.println("这是接口内的私有方法");
    }

}
