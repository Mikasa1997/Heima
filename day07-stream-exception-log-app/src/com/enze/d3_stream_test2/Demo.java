package com.enze.d3_stream_test2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {
    static double addMoney;
    static double allMoney;
    public static void main(String[] args) {
        List<Worker> one = new ArrayList<>();
        List<Worker> two = new ArrayList<>();

        Collections.addAll(one, new Worker("小王", '男', 8500, 3000, 3),
                new Worker("高婉莹", '女', 7800, 2000, 1),
                new Worker("胡恩泽", '男', 12000, 3000, 2),
                new Worker("小孙", '男', 8500, 3000, 4));
        Collections.addAll(two, new Worker("小宏", '男', 8500, 3000, 5),
                new Worker("小刘", '女', 7100, 2000, 3),
                new Worker("小玉", '男', 11000, 3000, 1),
                new Worker("小海", '男', 8133, 3000, 5),
                new Worker("小彭", '男', 5200, 1785, 1));

        TopWorker tw1 = new TopWorker(one.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).get().getName(),
                one.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).get().getSalary());
        TopWorker tw2 = new TopWorker(two.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).get().getName(),
                one.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).get().getSalary());
        System.out.println("-------------优秀员工------------------");
        System.out.println(tw1);
        System.out.println(tw2);
        System.out.println("-------------优秀员工另一种方式------------------");
        TopWorker tw1_1 = one.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))
                .map(worker -> new TopWorker(worker.getName(), worker.getSalary())).get();
        TopWorker tw2_1 = two.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))
                .map(worker -> new TopWorker(worker.getName(), worker.getSalary())).get();
        System.out.println(tw1_1);
        System.out.println(tw2_1);
        System.out.println("-------------平均工资------------------");
        one.stream().sorted((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).skip(1)
                .limit(one.size() - 2).forEach(s -> {
                    addMoney += s.getSalary();

                });
        System.out.println(addMoney / (one.size() - 2));
        System.out.println("-------------总平均工资------------------");
        Stream<Worker> s1 = one.stream();
        Stream<Worker> s2 = two.stream();
        Stream<Worker> s3 = Stream.concat(s1, s2);
        s3.sorted((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())).skip(1)
                .limit(one.size() + two.size() - 2).forEach(s -> {
                    allMoney += s.getSalary();
                });
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        BigDecimal c = a.divide(b, 2, RoundingMode.HALF_UP);
        System.out.println(c.doubleValue());

    }
}
