package com.enze.d8_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的快");
            }
        };

        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}

