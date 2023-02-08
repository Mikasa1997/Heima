package com.enze.d4_static_singleinstance;

public class SingleInstance2 {
    private SingleInstance2(){

    }
    private static SingleInstance2 instance2;

    public static SingleInstance2 getInstance2() {
        if(instance2 == null){
            instance2 = new SingleInstance2();
        }
        return instance2;
    }
    public static void setInstance2(SingleInstance2 instance2) {
        SingleInstance2.instance2 = instance2;
    }
}
