package com.enze.d3_code;

public class StaticDemo1 {
    /**
     * 静态代码块，属于类。与类一起优先加载一次。自动触发执行
     */
    public StaticDemo1(){
        System.out.println("无参构造器被触发执行了。");
    }
    static {
        System.out.println("静态代码块被触发执行了");
    }
    {
        System.out.println("实例代码块被创建了");
    }
    public static void main(String[] args) {

        System.out.println("HelloWorld");
        StaticDemo1 s1 = new StaticDemo1();

    }

}
