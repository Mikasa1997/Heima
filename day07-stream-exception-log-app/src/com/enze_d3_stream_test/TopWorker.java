package com.enze_d3_stream_test;

public class TopWorker {
    private String name;
    private double salary;

    public TopWorker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public TopWorker() {
    }

    @Override
    public String toString() {
        return "TopWorker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
