package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Addition;

public class AdditionRunner {
    public static void main(String[] args) {
        Addition addition=(a, b) -> a+b;
        long adds=addition.add(123,456);
        System.out.println("addition=="+adds);
    }
}
