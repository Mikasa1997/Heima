package com.enze_d3_stream_test;

import java.util.*;
public class Demo {
    static List<TopWorker> topWorkerList = new ArrayList<>();

    public static void main(String[] args) {
        List<Worker> apartOneList = new ArrayList<>();
        List<Worker> apartTwoList = new ArrayList<>();

        Collections.addAll(apartOneList, new Worker("小王", '男', 8500, 3000, 3),
                new Worker("高婉莹", '女', 7800, 2000, 1),
                new Worker("胡恩泽", '男', 12000, 3000, 2),
                new Worker("小孙", '男', 8500, 3000, 4));
        Collections.addAll(apartTwoList, new Worker("小宏", '男', 8500, 3000, 5),
                new Worker("小刘", '女', 7100, 2000, 3),
                new Worker("小玉", '男', 11000, 3000, 1),
                new Worker("小海", '男', 8100, 3000, 5),
                new Worker("小彭", '男', 5200, 1785, 1));
        System.out.println("----------第一组------------");
        Collections.sort(apartOneList, (o1, o2) -> o2.getSalary() - o1.getSalary() >= 0 ? 1 : -1);
        Collections.sort(apartTwoList, (o1, o2) -> o2.getSalary() - o1.getSalary() >= 0 ? 1 : -1);
        apartOneList.forEach(System.out::println);
        System.out.println("----------第二组------------");
        apartTwoList.forEach(System.out::println);
        System.out.println("----------优秀员工------------");
        getTopWorker(apartOneList);
        getTopWorker(apartTwoList);
        topWorkerList.forEach(System.out::println);
        System.out.println("----------两组平均工资------------");
        avageSalary(apartOneList);
        avageSalary(apartTwoList);
        System.out.println("----------两组总平均工资------------");
        avageSalaryAll(apartOneList,apartTwoList);
        System.out.println("================================================");
        System.out.println("----------第一组------------");
        apartOneList.forEach(System.out::println);
        System.out.println("----------第二组------------");
        apartTwoList.forEach(System.out::println);
    }

    public static void getTopWorker(List<Worker> list) {
        topWorkerList.add(new TopWorker(list.get(0).getName(), list.get(0).getSalary()));

    }

    public static void avageSalary(List<Worker> list) {
        double avageSalary = 0.0;
        for (int i = 1; i < list.size() - 1; i++) {
            avageSalary += list.get(i).getSalary();
        }
        System.out.println("平均工资是" + (avageSalary / (list.size() - 2)));
    }

    public static void avageSalaryAll(List<Worker> list1, List<Worker> list2) {
        List<Worker> listTemp = new ArrayList<>();
        listTemp.addAll(list1);
        listTemp.addAll(list2);
        Collections.sort(listTemp, (o1, o2) -> o2.getSalary() - o1.getSalary() >= 0 ? 1 : -1);
        listTemp.forEach(System.out::println);
        double avageSalary = 0.0;
        for (int i = 1; i < listTemp.size() - 1; i++) {
            avageSalary += listTemp.get(i).getSalary();
        }
        System.out.println("平均工资是" + (avageSalary / (listTemp.size() - 2)));

    }
}
