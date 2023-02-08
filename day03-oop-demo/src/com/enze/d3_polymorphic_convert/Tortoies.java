package com.enze.d3_polymorphic_convert;

public class Tortoies extends Animal {

    @Override
    public void run() {
        System.out.println("乌龟跑的贼慢");
    }
    public void layEggs(){
        System.out.println("乌龟再下蛋");
    }
}
