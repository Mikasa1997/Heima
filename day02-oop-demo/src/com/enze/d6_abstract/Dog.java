package com.enze.d6_abstract;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        super();
    }

    @Override
    public void run() {
        System.out.println("狗跑的贼快~~~");
    }
}
