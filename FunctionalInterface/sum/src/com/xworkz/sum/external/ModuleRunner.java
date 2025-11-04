package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Module;

public class ModuleRunner {
    public static void main(String[] args) {
        Module modules=(a, b) -> a/b;
        int mod= modules.divide(10,2);
        System.out.println("module of two numbers 10 and 2=="+mod);
    }
}
