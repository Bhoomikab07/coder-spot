package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Division;

public class DivisionRunner {
    public static void main(String[] args) {
        Division division=(a, b) -> a/b;
        int divide=division.div(4,2);
        System.out.println("division of two number 4 and 2 =="+divide);

            }
}
