package com.enze.d4_polymorphic_test;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("Win10电脑");
        computer.start();
        System.out.println("-------------------------------");
        USB u1 = new KeyBoard("青轴键盘");
        USB u2 = new Mouse("逻辑鼠标");
        computer.installUSB(u1);
        computer.installUSB(u2);

    }
}
