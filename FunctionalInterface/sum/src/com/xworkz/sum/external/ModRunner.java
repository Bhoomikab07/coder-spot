package com.xworkz.sum.external;

import com.xworkz.sum.bridge.Mod;
import com.xworkz.sum.bridge.Module;

public class ModRunner {
    public static void main(String[] args) {
        Mod module=(a, b) -> a/b;
        long modules=module.module(456,2788);
        System.out.println("module of two numbers 456 and 2788=="+modules);
    }
}
