package com.enze.d4_collections_test;

import java.util.*;

public class GameDemo {
    static List<Card> cards = new ArrayList<>();

    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥", "♦", "♣", "♠"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card card = new Card(size, color, index);
                cards.add(card);
            }
        }
        Collections.addAll(cards, new Card("大", "王", ++index), new Card("小", "王", ++index));
        System.out.println("新  牌：" + cards);
    }

    public static void main(String[] args) {
        //1.做牌
        //2.洗牌
        Collections.shuffle(cards);
        System.out.println("洗  牌：" + cards);
        //3.定义3个玩家
        List<Card> xiaoHu = new ArrayList<>();
        List<Card> xiaoGao = new ArrayList<>();
        List<Card> xiaoDong = new ArrayList<>();
        //4.发牌
        for (int i = 0; i < cards.size() - 3; i++) {
            Card card = cards.get(i);
            if (i % 3 == 0) {
                xiaoHu.add(card);
            } else if (i % 3 == 1) {
                xiaoGao.add(card);
            } else {
                xiaoDong.add(card);
            }
        }
        List<Card> lastThreeCards = cards.subList(cards.size() - 3, cards.size());
        //5.给玩家的牌排序
        sortCards(xiaoHu);
        sortCards(xiaoGao);
        sortCards(xiaoDong);

        //6.看牌
        System.out.println("小胡的牌：" + xiaoHu);
        System.out.println("小高的牌：" + xiaoGao);
        System.out.println("小董的牌：" + xiaoDong);
        System.out.println("最后3张底牌：" + lastThreeCards);
    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o2.getIndex() - o1.getIndex());
    }

}
