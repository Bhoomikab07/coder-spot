package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Add;

public class AddRunner {
    public static void main(String[] args) {
        Add add=(a, b) -> a+b;
        int adds=add.addition(40,60);
        System.out.println("addition="+adds);
    }
}
