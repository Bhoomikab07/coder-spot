package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Number;

public class NumberRunner {
    public static void main(String[] args) {
        Number number=(a, b) -> a-b;
        int numb=number.num(60,40);
        System.out.println("number="+numb);
    }
}
