package com.xworkz.multiplication.external;

import com.xworkz.multiplication.bridge.Total;

public class TotalRunner {
    public static void main(String[] args) {
        Total total=(a, b) -> a+b;
        int tot=total.tot(2,3);
        System.out.println("total="+tot);
    }
}
