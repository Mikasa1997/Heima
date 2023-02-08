package com.enze.d9_lambda;

public class Test {
    public static void main(String[] args) {
        /* 学会使用Lambda表达式 */
        //lambda只能简化接口中只有一个抽象方法的匿名内部类形式
        Swim s1 = () -> System.out.println("老师游泳贼6~~~");
        go(s1);
        go(() -> System.out.println("学生游的很慢~~"));
    }

    public static void go(Swim s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface //一旦加上这个注解，必须是函数式接口，里面只能有一个抽象方法。
interface Swim {
    void swim();
}
