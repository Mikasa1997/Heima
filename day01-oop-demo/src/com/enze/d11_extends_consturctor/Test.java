package com.enze.d11_extends_consturctor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("小王",29);
        System.out.println(teacher.getAge());
        teacher.eat();
    }
}
