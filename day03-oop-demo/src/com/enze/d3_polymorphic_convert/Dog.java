package com.enze.d3_polymorphic_convert;

public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("狗跑的贼快~~~");
    }
    public void lookDoor(){
        System.out.println("狗在看门");
    }
}
