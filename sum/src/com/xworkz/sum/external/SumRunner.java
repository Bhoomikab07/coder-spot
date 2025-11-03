package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Sum;

public class SumRunner {
    public static void main(String[] args) {
        Sum add=(a, b) -> a+b;
        int sum=add.calculate(20,50);
        System.out.println("addition of two numbers 20 and 50 is=="+sum);

    }
}
