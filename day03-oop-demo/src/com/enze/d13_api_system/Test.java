package com.enze.d13_api_system;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.4;
        double c = 0.3;
        double d = 10.0;

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal a2 = BigDecimal.valueOf(b);
        BigDecimal a3 = BigDecimal.valueOf(c);
        BigDecimal a4 = BigDecimal.valueOf(d);

        BigDecimal rs1 = a1.add(a2); // 0.5
        BigDecimal rs2 = a3.subtract(a4);// -9.7
        BigDecimal rs3 = a1.multiply(a2);//0.04
        BigDecimal rs4 = a4.divide(a3, 2, RoundingMode.HALF_UP);//33.33
        BigDecimal rs5 = a4.divide(a3, 2, RoundingMode.HALF_DOWN);//33.33
        BigDecimal rs6 = a4.divide(a3, 2, RoundingMode.HALF_EVEN);//33.33
        System.out.println("" + rs1 + ", " + rs2 + ", " + rs3 + ", " + rs4 + ", " + rs5 + ", " + rs6 + ", ");

    }
}
