package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Division;

public class DivisionRunner {
    public static void main(String[] args) {
        Division divisions = (a, b) -> a % b;
        int divides = divisions.divide(4, 2);
        System.out.println("division of two numbers 4 and 2==" +divides);
    }
}