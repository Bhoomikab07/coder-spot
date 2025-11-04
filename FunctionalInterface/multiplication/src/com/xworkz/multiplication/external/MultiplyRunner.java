package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Multiply;

public class MultiplyRunner {
    public static void main(String[] args) {
        Multiply multiply=(a, b) -> a*b;
        float mul=multiply.mul(20,4);
        System.out.println("multiply="+mul);
    }
}
