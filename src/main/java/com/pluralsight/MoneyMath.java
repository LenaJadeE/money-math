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

        floatTotal = 0;
        doubleTotal = 0;
        bigTotal = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            floatTotal += 19.99f;
            doubleTotal += 19.99;
            bigTotal = bigTotal.add(new BigDecimal("19.99"));
        }

        System.out.println();
        System.out.println("float: " + floatTotal);
        System.out.println("double: " + doubleTotal);
        System.out.println("BigDecimal: " + bigTotal);

        System.out.println();
        System.out.println("float equals double: " + (floatTotal == doubleTotal));
        System.out.println("double equals BigDecimal: " + (BigDecimal.valueOf(doubleTotal).compareTo(bigTotal) == 0));

        double floatOff = (floatTotal - bigTotal.doubleValue()) * 100;
        System.out.println("float is off by " + floatOff + " cents");

        BigDecimal ignored = BigDecimal.ZERO;
        ignored = ignored.add(new BigDecimal("5.00"));
        System.out.println("add without assigning: " + ignored);

        BigDecimal saved = BigDecimal.ZERO;
        saved = saved.add(new BigDecimal("5.00"));
        System.out.println("add and assign: " + saved);
    }
}
