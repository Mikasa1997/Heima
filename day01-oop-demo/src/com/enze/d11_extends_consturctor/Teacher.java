package com.enze.d11_extends_consturctor;

public class Teacher extends People{
    public Teacher(String name, int age){
        super(name, age);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println(super.getName() + "吃的是汉堡");
    }
}
