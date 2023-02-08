package com.enze.d3_polymorphic_convert;



public class Test {
    public static void main(String[] args) {
        //1.自动类型转换
        Animal a = new Dog();
        a.run();
        //2.强制类型转换
        Animal a2 = new Tortoies();
        a2.run();
        Tortoies t = (Tortoies) a2;//从父类到子类，必须强制转换
        t.layEggs();

    }
}
