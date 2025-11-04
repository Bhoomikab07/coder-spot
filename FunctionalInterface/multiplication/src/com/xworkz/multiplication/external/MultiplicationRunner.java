package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Multiplication;

public class MultiplicationRunner {
    public static void main(String[] args) {
        Multiplication multiplication=(a, b) -> a*b;
        float multi=multiplication.mul(2,3);
        System.out.println("multiplication="+multi);
    }
}
