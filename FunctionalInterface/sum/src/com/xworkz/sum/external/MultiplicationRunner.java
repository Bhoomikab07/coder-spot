package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Multiplication;

public class MultiplicationRunner {
    public static void main(String[] args) {
        Multiplication multi=(a, b) -> a*b;
        long multiples=multi.multiple(256,678);
        System.out.println("multiple of two numbers 256 and 678=="+multiples);
    }
}
