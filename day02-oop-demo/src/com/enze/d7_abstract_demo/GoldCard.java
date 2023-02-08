package com.enze.d7_abstract_demo;

public class GoldCard extends Card {
    public GoldCard(String name, double money) {
        super(name,money);
    }

    @Override
    public void pay(double money) {
        System.out.println(getName() + "，您好!");
        System.out.println("您当前消费" + money);
        System.out.println("您的余额是：" + getMoney());
        System.out.println("折扣后需要消费：" + money * 0.8);
        setMoney(getMoney() - money*0.8);
        System.out.println("您剩余的余额是："+ getMoney());
    }
}
