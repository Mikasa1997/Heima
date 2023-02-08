package com.enze.d5_integer;

public class Test {
    public static void main(String[] args) {
        String number = "24";
        int age = Integer.parseInt(number);
        double douNum = Double.parseDouble(number);

        int age2 = Integer.valueOf(number);
        double douNum2 = Double.valueOf(number);
    }
}
