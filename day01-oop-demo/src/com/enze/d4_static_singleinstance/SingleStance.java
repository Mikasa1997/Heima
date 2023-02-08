package com.enze.d4_static_singleinstance;

public class SingleStance {
    public static SingleStance instance = new SingleStance();
    /* 1.把构造器私有化 */
    private SingleStance(){

    }
}
