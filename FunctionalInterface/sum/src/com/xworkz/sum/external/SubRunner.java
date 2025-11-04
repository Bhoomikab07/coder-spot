package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Sub;

public class SubRunner {
    public static void main(String[] args) {
        Sub substract=(a, b) -> a-b;
        float substraction=substract.subs(2.2f,3.3f);
        System.out.println("substraction of two numbers 2.2 and 3.3=="+substraction);
    }
}
