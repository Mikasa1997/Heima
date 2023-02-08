package com.enze.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        //1.多态的形式
        Animal d = new Dog();
        d.run();
        Animal t = new Tortoies();
        t.run();
    }
}
