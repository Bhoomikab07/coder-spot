package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Div;

public class DivRunner {
    public static void main(String[] args) {
        Div div=(a, b) -> a/b;
        long division=div.divide(60,10);
        System.out.println("division="+division);
    }
}
