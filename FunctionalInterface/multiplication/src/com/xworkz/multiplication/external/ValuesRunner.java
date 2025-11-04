package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Values;

public class ValuesRunner {
    public static void main(String[] args) {
        Values values=(a, b) -> a%b;
        long value=values.val(6,2);
        System.out.println("values="+value);
    }
}
