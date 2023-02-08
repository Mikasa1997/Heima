package com.enze.d5_collection_list;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        //1.栈
        LinkedList<String> stack = new LinkedList<>();
        //2.压栈
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        System.out.println(stack);
        //3.出栈
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("-------------------------------------");
        //4.队列
        LinkedList<String> queue = new LinkedList<>();
        //5.入队
        queue.offerLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        //6.出队
        queue.removeFirst();
        queue.removeFirst();
        queue.removeFirst();
        System.out.println(queue);
        System.out.println("-------------------------------------");
    }
}
