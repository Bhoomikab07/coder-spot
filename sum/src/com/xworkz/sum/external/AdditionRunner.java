package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Addition;

public class AdditionRunner {
    public static void main(String[] args) {
        Addition adds=(a, b) -> a+b;
        long adding=adds.add(67787,667889);
        System.out.println("add two numbers 67787 and 667889=="+adding);
    }
}
