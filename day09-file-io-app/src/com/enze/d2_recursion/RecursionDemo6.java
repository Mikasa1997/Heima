package com.enze.d2_recursion;

public class RecursionDemo6 {

    public static int totleNumber;
    public static int lastCoverNumber;
    public static int lastBottleNumber;

    public static void main(String[] args) {
        buy(10);
        System.out.println("" + totleNumber + lastCoverNumber + lastBottleNumber);
    }

    public static void buy(int money) {
        int buyNumber = money / 2;
        totleNumber += buyNumber;

        int coverNumber = lastCoverNumber + buyNumber;
        int bottleNumber = lastBottleNumber + buyNumber;

        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;

        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;

        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}
