package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Divide;

public class DivideRunner {
    public static void main(String[] args) {
        Divide divides=(a, b) -> a%b;
        float divided=divides.div(4.2f,2.2f);
        System.out.println("division of two number 4.2 and 2.2=="+divided);
    }
}
