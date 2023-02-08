package com.enze_d3_stream_test;

import java.util.Objects;

public class Worker implements Comparable<Worker> {
    private String name;
    private char sex;
    private double salary;
    private double reward;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return sex == worker.sex && Double.compare(worker.salary, salary) == 0 && Double.compare(worker.reward, reward) == 0 && punishCount == worker.punishCount && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, salary, reward, punishCount);
    }

    private int punishCount;

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public int getPunishCount() {
        return punishCount;
    }

    public void setPunishCount(int punishCount) {
        this.punishCount = punishCount;
    }

    public Worker(String name, char sex, double salary, double reward, int punishCount) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.reward = reward;
        this.punishCount = punishCount;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", reward=" + reward +
                ", punishCount=" + punishCount +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return Double.compare(o.getSalary(), salary);
    }
}
