package com.yang.c2.test;

import com.yang.c2.AbstractProgression;
import com.yang.c2.ArithmethicProgression;
import com.yang.c2.FibonacciProgression;
import com.yang.c2.GeometricProgression;

public class Test {
    public static void main(String[] args) {
        ArithmethicProgression arithmethicProgression = new ArithmethicProgression(4,2);
        arithmethicProgression.printProgression(5);

        System.out.println();

        GeometricProgression geometricProgression = new GeometricProgression(2);
        geometricProgression.printProgression(5);

        System.out.println();

        FibonacciProgression fibonacciProgression = new FibonacciProgression(1, 2);
        fibonacciProgression.printProgression(5);
    }
}
