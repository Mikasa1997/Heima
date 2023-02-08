package com.enze.d3_code;

import java.util.ArrayList;

public class StaticTest {
    /*
    * 1、定义一个静态的集合，这样的集合只加载一个，因为只有一副牌
    * */
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥", "♦","♠","♣"};
        for (String size : sizes) {
            for (String color : colors) {
                String card = size + color;
                cards.add(card);
            }
        }
        cards.add("小王");
        cards.add("大王");
    }
    public static void main(String[] args) {
        /* 模拟游戏启动前，初始化54张牌数据 */
        System.out.println(cards);

    }
}
