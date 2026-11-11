package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {

    public static void main(String[] args) {
        float floatTotal = 0;
        double doubleTotal = 0;
        BigDecimal bigTotal = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            floatTotal += 0.10f;
            doubleTotal += 0.10;
            bigTotal = bigTotal.add(new BigDecimal("0.10"));

            System.out.println("float: " + floatTotal + "  double: " + doubleTotal + "  BigDecimal: " + bigTotal);
        }

        BigDecimal ignored = BigDecimal.ZERO;
        ignored.add(new BigDecimal("5.00"));
        System.out.println("add without assigning: " + ignored);
    }
}
