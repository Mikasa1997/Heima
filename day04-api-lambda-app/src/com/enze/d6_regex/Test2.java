package com.enze.d6_regex;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //1.校验手机
        while (true) {
            checkMoney();
        }

    }

    public static void checkPhone() {
        while (true) {
            System.out.println("请输入您的注册手机号码：");
            String phoneNumber = new Scanner(System.in).next();
            if (phoneNumber.matches("1[3-9]\\d{9}")) {
                System.out.println("恭喜您，手机号注册成功：" + phoneNumber);
                return;
            } else {
                System.out.println("您输入的手机号有误，请重新输入！");
            }
        }
    }

    public static void checkMail() {
        while (true) {
            System.out.println("请输入您的注册邮箱账户：");
            String mail = new Scanner(System.in).next();
            //779271970@qq.com.cn
            if (mail.matches("\\w{1,30}@[\\w&&[^_]]{2,20}(\\.[\\w&&[^_]]{2,20}){1,2}")) {
                System.out.println("恭喜您，邮箱注册成功：" + mail);
                return;
            } else {
                System.out.println("您输入的邮箱有误，请重新输入！");
            }
        }
    }

    public static void checkTel() {
        while (true) {
            System.out.println("请输入您的注册电话账户：");
            String Tel = new Scanner(System.in).next();
            //011-0333333   011033333
            if (Tel.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("恭喜您，电话注册成功：" + Tel);
                return;
            } else {
                System.out.println("您输入的电话格式有误，请重新输入！");
            }
        }
    }

    public static void checkMoney(){
        while (true) {
            System.out.println("请输入您的金额：");
            String Money = new Scanner(System.in).next();
            //10  10.1  019
            if (Money.matches("\\d+\\.?\\d+")) {
                System.out.println("恭喜您，校验成功：" + Money);
                return;
            } else {
                System.out.println("您输入的金额格式有误，请重新输入！");
            }
        }
    }
}
