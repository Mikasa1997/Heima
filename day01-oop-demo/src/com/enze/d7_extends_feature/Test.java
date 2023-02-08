package com.enze.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        //1.子类不能继承父类的构造器
        //2.子类是否可以继承父类的私有成员？可以，但是没有访问权限。需要暴力访问
        //3.子类是否可以继承父类的静态成员？不可以，共享并非继承
        Tiger t = new Tiger();
        t.eat();
        System.out.println(Animal.location);
    }
}

class Animal {
    public void eat() {
        System.out.println("动物要吃东西");
    }

    public static String location = "灵璧";
}

class Tiger extends Animal {
}
