package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Num;

public class NumRunner {
    public static void main(String[] args) {
        Num num=(a, b) -> a-b;
        long number=num.number(80,50);
        System.out.println("numbers="+number);
    }
}
