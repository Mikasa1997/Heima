package com.enze.d8_exception_handle_runtime;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请您输入合法的价格:");
                String priceStr = sc.nextLine();
                Double priceDou = Double.valueOf(priceStr);
                //判断价格是否大于0
                if (priceDou > 0) {
                    System.out.println("定价: " + priceDou);
                }else {
                    System.out.println("价格必须是正数~~~");
                }
            } catch (Exception e) {
                System.out.println("用户输入的数据有误");
            }
        }
    }
}
