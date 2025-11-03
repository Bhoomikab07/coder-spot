package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Subtraction;

public class SubtractionRunner {
    public static void main(String[] args) {
        Subtraction minus=(a, b) -> a-b;
        int subtract = minus.subtract(40,35);
        System.out.println("subtracting two numbers 40 and 35=="+subtract);
    }
}
