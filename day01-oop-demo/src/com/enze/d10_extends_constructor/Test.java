package com.enze.d10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄");
    }
}

class Animal {
    Animal() {
        System.out.println("这是父类的无参构造器");
    }

    Animal(String name) {
        System.out.println("这是父类" + name + "的无参构造器");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println(name + "在吃饭");
    }
}
