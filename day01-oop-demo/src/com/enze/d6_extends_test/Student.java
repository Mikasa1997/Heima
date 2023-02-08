package com.enze.d6_extends_test;

public class Student extends People{
    /* 独有的行为
    * 1.填写反馈信息
    * */
    public void writeInformation(){
        System.out.println(getName() + "写下了：学习语法，好happy");
    }

}
