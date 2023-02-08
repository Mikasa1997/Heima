package com.enze.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
//2.需求：降序排列
        Integer[] age2 = {34, 12, 23, 44};
        Arrays.sort(age2, (o1, o2) -> -(o1 - o2));
        System.out.println(Arrays.toString(age2));
        System.out.println("------------------------------------------");
        JFrame jFrame = new JFrame("登录界面");

        JButton jButton = new JButton("我是一个按钮");
        jButton.addActionListener(e -> System.out.println("点我点我点我！"));
        jFrame.add(jButton);
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);

    }
}
