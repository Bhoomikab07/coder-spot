package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Multiple;

public class MultipleRunner {
    public static void main(String[] args) {
        Multiple into=(a, b) -> a*b;
        int multiplication=into.multiply(20,4);
        System.out.println("multiple two numbers 20 and 4=="+multiplication);
    }
}
